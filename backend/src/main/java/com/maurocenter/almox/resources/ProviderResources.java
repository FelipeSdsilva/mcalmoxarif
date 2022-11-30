package com.maurocenter.almox.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.maurocenter.almox.dto.ProviderDTO;
import com.maurocenter.almox.services.ProviderService;

@RestController
@RequestMapping(value = "/providers")
public class ProviderResources {

	@Autowired
	private ProviderService provService;

	@GetMapping
	public ResponseEntity<List<ProviderDTO>> findAllProvider() {
		List<ProviderDTO> listProv = provService.listProvider();
		return ResponseEntity.ok().body(listProv);
	}

	@GetMapping(value = "{id}")
	public ResponseEntity<ProviderDTO> findById(@PathVariable Long id) {
		ProviderDTO provDto = provService.findProviderById(id);
		return ResponseEntity.ok().body(provDto);
	}

	@PostMapping(value = "{cnpj}")
	public ResponseEntity<ProviderDTO> insertProviderWithCnpj(@PathVariable String cnpj) {
		ProviderDTO provDto = provService.insertNewProviderWithCnpj(cnpj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(provDto.getId()).toUri();
		return ResponseEntity.created(uri).body(provDto);
	}

	@PostMapping
	public ResponseEntity<ProviderDTO> insertProvider(@RequestBody ProviderDTO provDto) {
		provDto = provService.insertNewProvider(provDto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(provDto.getId()).toUri();
		return ResponseEntity.created(uri).body(provDto);
	}

	@PutMapping(value = "{id}")
	public ResponseEntity<ProviderDTO> updateProvider(@PathVariable Long id, @RequestBody ProviderDTO provDto) {
		provDto = provService.updateProvider(id, provDto);
		return ResponseEntity.ok().body(provDto);
	}

	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> deleteProvider(@PathVariable Long id) {
		provService.deleteProvider(id);
		return ResponseEntity.noContent().build();
	}
}
