package com.maurocenter.almox.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maurocenter.almox.dto.ClientDTO;
import com.maurocenter.almox.entities.Client;
import com.maurocenter.almox.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository cliRepository;

	@Transactional(readOnly = true)
	public Page<ClientDTO> pageClient(Pageable pageable) {
		return cliRepository.findAll(pageable).map(ClientDTO::new);
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findClientById(Long id) {
		Client entity = cliRepository.findById(id).orElseThrow();
		return new ClientDTO(entity);
	}
	
	@Transactional
	public ClientDTO insertNewClient(ClientDTO cliDto) {
		Client entity = new Client();
		entity.convertDtoToEntity(entity, cliDto);
		entity = cliRepository.save(entity);
		return new ClientDTO(entity);
	}
	
	@Transactional
	public ClientDTO updateClient(Long id, ClientDTO cliDto) {
		Client entity = cliRepository.getReferenceById(id);
		entity.convertDtoToEntity(entity, cliDto);
		entity = cliRepository.save(entity);
		return new ClientDTO(entity);
	}
	
	public void deleteClientById(Long id) {
		cliRepository.deleteById(id);
	}
	
}
