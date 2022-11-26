package com.maurocenter.almox.dto;

import java.io.Serializable;

import com.maurocenter.almox.entities.Client;
import com.maurocenter.almox.entities.enums.ClientType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String document;
	private String email;
	private ClientType type;
	private Integer number;
	private String complements;

	private AddressDTO adrDto;


	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		document = entity.getDocument();
		email = entity.getEmail();
		type = entity.getType();
		number = entity.getNumber();
		complements = entity.getComplements();
		
	}
}
