package com.maurocenter.almox.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maurocenter.almox.dto.ClientDTO;
import com.maurocenter.almox.entities.Client;
import com.maurocenter.almox.repositories.AddressRepository;
import com.maurocenter.almox.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(Pageable pageable) {
		Page<Client> list = clientRepository.findAll(pageable);
		return list.map(x -> new ClientDTO(x , x.getAddresses()));
	}

}
