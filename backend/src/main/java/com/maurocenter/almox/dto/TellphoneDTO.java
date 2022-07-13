package com.maurocenter.almox.dto;

import java.io.Serializable;

import com.maurocenter.almox.entites.enums.TypeTell;

public class TellphoneDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private TypeTell type;
	private String number;

	private ClientDTO client;

	private ProviderDTO provider;

	public TellphoneDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TypeTell getType() {
		return type;
	}

	public void setType(TypeTell type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public ClientDTO getClient() {
		return client;
	}

	public void setClient(ClientDTO client) {
		this.client = client;
	}

	public ProviderDTO getProvider() {
		return provider;
	}

	public void setProvider(ProviderDTO provider) {
		this.provider = provider;
	}
	
	

}
