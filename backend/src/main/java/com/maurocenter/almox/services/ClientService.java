package com.maurocenter.almox.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maurocenter.almox.dto.ClientDTO;
import com.maurocenter.almox.entities.Client;
import com.maurocenter.almox.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(Pageable pageable) {
		Page<Client> page = clientRepository.findAll(pageable);
		return page.map(ClientDTO::new);
	}

	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client entity = new Client();
		entity.convertEntityToDto(dto, entity);
		entity = clientRepository.save(entity);
		return new ClientDTO(entity);
	}

	

}
