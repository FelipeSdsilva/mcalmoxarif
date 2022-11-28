package com.maurocenter.almox.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurocenter.almox.dto.AddressDTO;
import com.maurocenter.almox.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository adrRepository;
	
	public List<AddressDTO> listAlladdress(){
		return adrRepository.findAll().stream().map(AddressDTO::new).toList();
	}
}
