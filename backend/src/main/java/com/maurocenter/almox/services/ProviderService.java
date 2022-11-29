package com.maurocenter.almox.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maurocenter.almox.dto.ProviderDTO;
import com.maurocenter.almox.entities.Provider;
import com.maurocenter.almox.repositories.ProviderRepository;
import com.maurocenter.almox.repositories.ReceitaWsRepository;

@Service
public class ProviderService {

	@Autowired
	private ProviderRepository provRepository;
	
	@Autowired
	private ReceitaWsRepository receitaRepository;
	
	@Transactional(readOnly = true)
	public List<ProviderDTO> listProvider(){
		return provRepository.findAll().stream().map(ProviderDTO::new).toList();
	}
	
	@Transactional(readOnly = true)
	public ProviderDTO findProviderById(Long id) {
		Provider entity = provRepository.findById(id).orElseThrow();
		return new ProviderDTO(entity);
	}
	
	@Transactional
	public ProviderDTO insertNewProvider(String cnpj) {
		ProviderDTO provDto = receitaRepository.consultCnpJ(cnpj);
		Provider entity = new Provider();
		entity.convertDtoInEntity(entity, provDto);
		entity = provRepository.save(entity);
		return new ProviderDTO(entity);
	}
	
	@Transactional
	public ProviderDTO updateProvider(Long id, ProviderDTO provDto) {
		Provider entity = provRepository.getReferenceById(id);
		entity.convertDtoInEntity(entity, provDto);
		entity = provRepository.save(entity);
		return new ProviderDTO();
	}
	
	public void deleteProvider(Long id) {
		provRepository.deleteById(id);
	}
}
