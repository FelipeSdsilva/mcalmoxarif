package com.maurocenter.almox.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.maurocenter.almox.entites.Provider;

public class ProviderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String comercialName;
	private String fantasyName;
	private String email;

	List<ProductDTO> products = new ArrayList<>();

	public ProviderDTO() {
	}

	public ProviderDTO(Long id, String comercialName, String fantasyName, String email) {
		this.id = id;
		this.comercialName = comercialName;
		this.fantasyName = fantasyName;
		this.email = email;
	}

	public ProviderDTO(Provider entity) {
		id = entity.getId();
		comercialName = entity.getComercialName();
		fantasyName = entity.getFantasyName();
		email = entity.getEmail();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComercialName() {
		return comercialName;
	}

	public void setComercialName(String comercialName) {
		this.comercialName = comercialName;
	}

	public String getFantasyName() {
		return fantasyName;
	}

	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

}
