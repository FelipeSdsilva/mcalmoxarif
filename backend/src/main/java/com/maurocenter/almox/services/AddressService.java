package com.maurocenter.almox.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maurocenter.almox.dto.AddressDTO;
import com.maurocenter.almox.entities.Address;
import com.maurocenter.almox.repositories.AddressRepository;
import com.maurocenter.almox.repositories.IViaCepRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository adrRepository;

	@Autowired
	private IViaCepRepository viaCep;

	@Transactional(readOnly = true)
	public List<AddressDTO> listAlladdress() {
		return adrRepository.findAll().stream().map(AddressDTO::new).toList();
	}

	@Transactional(readOnly = true)
	public AddressDTO findAddByid(Long id) {
		Address adrEnt = adrRepository.findById(id).orElseThrow();
		return new AddressDTO(adrEnt);
	}

	@Transactional
	public AddressDTO insertNewAdd(String cep, AddressDTO adrDto) {
		Address entity = new Address();
		adrDto = viaCep.consultCep(cep);
		entity.convertDtoInEntity(entity, adrDto);
		entity = adrRepository.save(entity);
		return new AddressDTO(entity);

	}

	@Transactional
	public AddressDTO updateAddress(Long id, String cep, AddressDTO adrDto) {
		Address entity = adrRepository.getReferenceById(id);
		adrDto = viaCep.consultCep(cep);
		entity.convertDtoInEntity(entity, adrDto);
		entity = adrRepository.save(entity);
		return new AddressDTO(entity);
	}

	public void deleteAddress(Long id) {
		adrRepository.deleteById(id);
	}
}