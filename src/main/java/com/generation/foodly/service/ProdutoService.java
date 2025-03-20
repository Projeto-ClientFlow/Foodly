package com.generation.foodly.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.generation.foodly.model.Produto;
import com.generation.foodly.model.Usuario;
import com.generation.foodly.repository.ProdutoRepository;
import com.generation.foodly.repository.UsuarioRepository;
import com.generation.foodly.security.JwtService;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private JwtService jwtService;

 // Função especial: Liberação de Cupom de Desconto de 10% para Produtos Acima de R$ 100
    public ResponseEntity<String> aplicarDesconto(Long id, String token) {
     
        // Valida o token JWT e extrai o nome do usuário
        String usuarioNome = jwtService.extractUsername(token);
        
        if (usuarioNome == null) {
            return ResponseEntity.status(401).body("Usuário não autenticado. Por favor, faça login.");
        }

        Optional<Usuario> usuario = usuarioRepository.findByUsuario(usuarioNome);

        if (usuario.isEmpty()) {
            return ResponseEntity.status(404).body("Usuário não encontrado.");
        }

        // Busca o produto pelo ID
        Optional<Produto> produtoOpt = produtoRepository.findById(id);

        if (produtoOpt.isEmpty()) {
            return ResponseEntity.status(404).body("Produto não encontrado.");
        }

        Produto produto = produtoOpt.get();

        // Verifica se o preço do produto é maior que R$ 100
        if (produto.getPrecoProduto() > 100) {
            double desconto = produto.getPrecoProduto() * 0.10;  // Calcula 10% de desconto
            double precoComDesconto = produto.getPrecoProduto() - desconto;

            // Atualiza o produto com o novo preço
            produto.setPrecoProduto((float) precoComDesconto);
            produtoRepository.save(produto);

            return ResponseEntity.ok("Desconto de 10% aplicado! Novo preço: R$ " + precoComDesconto);
        } else {
            return ResponseEntity.status(400).body("O preço do produto não é superior a R$ 100,00. Desconto não aplicado.");
        }
    }
}