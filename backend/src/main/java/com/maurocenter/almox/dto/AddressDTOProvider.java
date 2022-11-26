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
public class AddressDTOProvider extends AddressDTO{
	private static final long serialVersionUID = 1L;

	private Long providerId;
	
	public AddressDTOProvider(Address entity) {
		super(entity);
		providerId = entity.getProvider().getId();
	}
}
