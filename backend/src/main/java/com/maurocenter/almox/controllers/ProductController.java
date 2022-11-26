package com.maurocenter.almox.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.maurocenter.almox.dto.ProductDTO;
import com.maurocenter.almox.services.ProductService;

@RestController
@RequestMapping(value ="/products")
public class ProductController {

	@Autowired
	private ProductService prodService;
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAllProd(){
		List<ProductDTO> listProd = prodService.findAllProd();
		return ResponseEntity.ok().body(listProd);
	}
	
	@PutMapping
	public ResponseEntity<ProductDTO> insertProduct(@RequestBody ProductDTO dto){
		dto =  prodService.insertProduct(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId())
				.toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}
