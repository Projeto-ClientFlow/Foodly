package com.generation.foodly.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.foodly.model.Produto;
import com.generation.foodly.repository.CategoriaRepository;
import com.generation.foodly.repository.ProdutoRepository;
import com.generation.foodly.service.ProdutoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(produtoRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable Long id){
		return produtoRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produto>> getByNome(@PathVariable String nome){
		nome = nome.replace("-", " "); 
	    return ResponseEntity.ok(produtoRepository.findAllByNomeProdutoContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post(@Valid @RequestBody Produto produto){
	    if (categoriaRepository.existsById(produto.getCategoria().getId()))
	        return ResponseEntity.status(HttpStatus.CREATED)
	            .body(produtoRepository.save(produto));

	    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Categoria não existe!",null);
	}
	
	
	@PutMapping
	public ResponseEntity<Produto> put(@Valid @RequestBody Produto produto) {
	    if (produtoRepository.existsById(produto.getId())) {
	        if (categoriaRepository.existsById(produto.getCategoria().getId())) {
	            return ResponseEntity.status(HttpStatus.OK)
	                .body(produtoRepository.save(produto));
	        }
	        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Categoria não existe!",null);
	    }
	    return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@PostMapping("desconto/{id}")
	public ResponseEntity<String> aplicarDesconto(@PathVariable Long id, 
	                                              @RequestHeader("Authorization") String authorizationHeader) {
	    // Extrai o token JWT da string que vem no formato "Bearer <token>"
	    String token = authorizationHeader.substring(7);  // Remove o "Bearer " (7 caracteres)

	    // Chama o serviço para aplicar o desconto no produto
	    return produtoService.aplicarDesconto(id, token);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
	    Optional<Produto> produto = produtoRepository.findById(id);

	    if (produto.isEmpty())
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND);

	    produtoRepository.deleteById(id);
	}

}