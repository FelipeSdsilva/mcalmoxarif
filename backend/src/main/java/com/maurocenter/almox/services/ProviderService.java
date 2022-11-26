package com.maurocenter.almox.services;

import java.util.List;

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
		return list.stream().map(ProviderDTO::new).toList();
	}

	public ProviderDTO insertProvider(ProviderDTO dto) {
		Provider entity = new Provider();
		entity.convertEntityToDto(dto,entity);
		entity = providRepository.save(entity);
		return new ProviderDTO(entity);
	}
}
