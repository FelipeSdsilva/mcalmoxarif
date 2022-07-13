package com.maurocenter.almox.dto;

import java.io.Serializable;

import com.maurocenter.almox.entites.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String corporationName;
	private String cnpj;
	private String email;

	private AddressDTO address;

	public ClientDTO() {
	}

	public ClientDTO(Long id, String corporationName, String cnpj, String email, AddressDTO address) {
		super();
		this.id = id;
		this.corporationName = corporationName;
		this.cnpj = cnpj;
		this.email = email;
		this.address = address;
	}

	public ClientDTO(Client entity) {
		id = entity.getId();
		corporationName = entity.getCorporationName();
		cnpj = entity.getCnpj();
		email = entity.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorporationName() {
		return corporationName;
	}

	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

}
