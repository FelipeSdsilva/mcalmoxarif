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

import com.maurocenter.almox.dto.AddressDTO;
import com.maurocenter.almox.services.AddressService;

@RestController
@RequestMapping(value = "/adresses")
public class AddressResource {

	@Autowired
	private AddressService adrService;

	@GetMapping
	public ResponseEntity<List<AddressDTO>> listAllAddr() {
		List<AddressDTO> listAdd = adrService.listAlladdress();
		return ResponseEntity.ok().body(listAdd);
	}

	@GetMapping(value = "{id}")
	public ResponseEntity<AddressDTO> findAddById(@PathVariable Long id) {
		AddressDTO adrDto = adrService.findAddByid(id);
		return ResponseEntity.ok().body(adrDto);
	}

	@PostMapping(value = "{cep}")
	public ResponseEntity<AddressDTO> insertNewAdr(@PathVariable String cep, @RequestBody AddressDTO adrDto) {
		adrDto = adrService.insertNewAdd(cep, adrDto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(adrDto.getId()).toUri();
		return ResponseEntity.created(uri).body(adrDto);
	}

	@PutMapping(value = "{id}/{cep}")
	public ResponseEntity<AddressDTO> updateById(@PathVariable Long id, @PathVariable String cep,
			@RequestBody AddressDTO adrDto) {
		adrDto = adrService.updateAddress(id, cep, adrDto);
		return ResponseEntity.ok().body(adrDto);
	}

	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> deleteAddressById(@PathVariable Long id) {
		adrService.deleteAddress(id);
		return ResponseEntity.noContent().build();
	}

}
