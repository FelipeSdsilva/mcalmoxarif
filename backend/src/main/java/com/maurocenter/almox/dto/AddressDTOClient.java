package com.maurocenter.almox.dto;

import com.maurocenter.almox.entities.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTOClient extends AddressDTO{
	private static final long serialVersionUID = 1L;

	private Long clientId;
	
	public AddressDTOClient(Address entity) {
		super(entity);
		clientId = entity.getClient().getId();
	}
	
}
