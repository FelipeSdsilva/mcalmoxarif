package com.maurocenter.almox.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurocenter.almox.dto.AddressDTO;
import com.maurocenter.almox.services.AddressService;

@RestController
@RequestMapping(value = "/address")
public class AddressResource {

	@Autowired
	private AddressService adrService;
	
	public ResponseEntity<List<AddressDTO>> listAllAddr(){
		List<AddressDTO> listAdd = adrService.listAlladdress();
		return ResponseEntity.ok().body(listAdd);
	}
}
