package com.maurocenter.almox.dto;

import java.io.Serializable;

import com.maurocenter.almox.entites.Address;

public class AddressDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Integer number;
	private String district;
	private String city;
	private String state;
	private String cep;

	private ClientDTO client;

	private ProviderDTO provider;

	public AddressDTO() {
	}

	public AddressDTO(Long id, String name, Integer number, String district, String city, String state, String cep,
			ClientDTO client, ProviderDTO provider) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.district = district;
		this.city = city;
		this.state = state;
		this.cep = cep;
		this.client = client;
		this.provider = provider;
	}

	public AddressDTO(Address entity) {
		id = entity.getId();
		name = entity.getName();
		number = entity.getNumber();
		district = entity.getDistrict();
		city = entity.getCity();
		state = entity.getState();
		cep = entity.getCep();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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
