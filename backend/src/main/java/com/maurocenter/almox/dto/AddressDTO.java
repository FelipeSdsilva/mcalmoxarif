package com.maurocenter.almox.dto;

import java.io.Serializable;

import com.maurocenter.almox.entities.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String logradouro;
	private String bairro;
	private String localidade;
	private String uf;
	private String cep;

	public AddressDTO(Address entity) {
		id = entity.getId();
		logradouro = entity.getNameStreet();
		bairro = entity.getDistrict();
		localidade = entity.getCity();
		uf = entity.getState();
		cep = entity.getCep();
	}
}
