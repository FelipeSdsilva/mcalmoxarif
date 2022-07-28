package com.maurocenter.almox.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurocenter.almox.dto.ProviderDTO;
import com.maurocenter.almox.entities.Provider;
import com.maurocenter.almox.repositories.ProviderRepository;

@Service
public class ProviderService {
	
	@Autowired
	private ProviderRepository providRepository;
	
	public List<ProviderDTO> findAll() {
		List<Provider> list = providRepository.findAll();
		return list.stream().map(x -> new ProviderDTO(x)).collect(Collectors.toList());
	}

	public ProviderDTO insertProvider(ProviderDTO dto) {
		Provider entity = new Provider();
		insertToProvider(dto,entity);
		entity = providRepository.save(entity);
		return new ProviderDTO(entity);
	}
	
	private void insertToProvider(ProviderDTO dto, Provider entity) {
		entity.setCorporateName(dto.getCorporateName());
		entity.setFantasyName(dto.getFantasyName());
		entity.setSocialRegister(dto.getSocialRegister());
		entity.setEmail(dto.getEmail());
		entity.setNameStreet(dto.getNameStreet());
		entity.setNumber(dto.getNumber());
		entity.setDistrict(dto.getDistrict());
		entity.setCity(dto.getCity());
		entity.setState(dto.getState());
		entity.setCep(dto.getCep());
		entity.setPhone(dto.getPhone());
	}
}
