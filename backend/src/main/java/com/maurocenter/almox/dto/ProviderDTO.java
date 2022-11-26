package com.maurocenter.almox.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.maurocenter.almox.entities.Provider;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProviderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String corporateName;
	private String fantasyName;
	private String socialRegister;
	private String email;
	private Integer number;

	private Set<ProductDTO> products = new HashSet<>();

	public ProviderDTO(Provider entity) {
		id = entity.getId();
		corporateName = entity.getCorporateName();
		fantasyName = entity.getFantasyName();
		socialRegister = entity.getSocialRegister();
		email = entity.getEmail();
		number = entity.getNumber();

	}
}
