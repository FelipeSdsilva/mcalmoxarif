package com.maurocenter.almox.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.maurocenter.almox.dto.ProviderDTO;
import com.maurocenter.almox.services.ProviderService;

@RestController
@RequestMapping(value ="/providers")
public class ProviderController {

	@Autowired
	private ProviderService service;
	
	@GetMapping
	public ResponseEntity<List<ProviderDTO>> findAllProvid(){
		List<ProviderDTO> listProvi = service.findAll();		
		return ResponseEntity.ok().body(listProvi);
	}
	
	@PutMapping
	public ResponseEntity<ProviderDTO> insertProvider(@PathVariable ProviderDTO dto){
		dto =  service.insertProvider(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId())
				.toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}

