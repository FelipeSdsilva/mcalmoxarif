package com.maurocenter.almox.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.maurocenter.almox.dto.ClientDTO;
import com.maurocenter.almox.services.AddressService;
import com.maurocenter.almox.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientService cliService;

	@SuppressWarnings("unused")
	@Autowired
	private AddressService adrService;

	@GetMapping
	public ResponseEntity<Page<ClientDTO>> pageOfClient(Pageable pageable) {
		Page<ClientDTO> pageClient = cliService.pageClient(pageable);
		return ResponseEntity.ok().body(pageClient);
	}

	@GetMapping(value = "{id}")
	public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
		ClientDTO cliDto = cliService.findClientById(id);
		return ResponseEntity.ok().body(cliDto);
	}

	@PostMapping
	public ResponseEntity<ClientDTO> insertNewClient(@RequestBody ClientDTO cliDto) {
		cliDto = cliService.insertNewClient(cliDto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(cliDto.getId()).toUri();
		return ResponseEntity.created(uri).body(cliDto);
	}

	@PutMapping(value = "{id}")
	public ResponseEntity<ClientDTO> updateClient(@PathVariable Long id, @RequestBody ClientDTO cliDto) {
		cliDto = cliService.updateClient(id, cliDto);
		return ResponseEntity.ok().body(cliDto);
	}

	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
		cliService.deleteClientById(id);
		return ResponseEntity.noContent().build();
	}
}
