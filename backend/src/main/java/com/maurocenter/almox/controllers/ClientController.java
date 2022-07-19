package com.maurocenter.almox.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurocenter.almox.dto.ClientDTO;
import com.maurocenter.almox.services.ClientService;

@RestController
@RequestMapping(value ="/clients")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public ResponseEntity<Page<ClientDTO>> findallPaged(Pageable pageable){
		Page<ClientDTO> page = clientService.findAllPaged(pageable);
		return ResponseEntity.ok().body(page);
	}
	
}
