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
	private String nameStreet;
	private String district;
	private String city;
	private String state;
	private String cep;
	

	public AddressDTO(Address entity) {
		nameStreet = entity.getNameStreet();
		district = entity.getDistrict();
		city = entity.getDistrict();
		state = entity.getState();
		cep = entity.getCep();
	}
}
