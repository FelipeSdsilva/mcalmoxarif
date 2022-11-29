package com.maurocenter.almox.dto;

import java.io.Serializable;

import com.maurocenter.almox.entities.Client;
import com.maurocenter.almox.entities.enums.TypeClient;

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
	private String lastName;
	private String email;
	private String document;
	private TypeClient type;
	private Integer number;
	private String complement;
	
	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		lastName = entity.getLastName();
		email = entity.getEmail();
		document = entity.getDocument();
		type = entity.getType();
		number = entity.getNumber();
		complement = entity.getComplement();
	}

}
