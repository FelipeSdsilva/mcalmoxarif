package com.maurocenter.almox.dto;

import java.io.Serializable;

import com.maurocenter.almox.entities.Address;

public class AddressDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nameStreet;
	private Integer number;
	private String district;
	private String city;
	private String state;
	private String cep;

	public AddressDTO() {
	}

	public AddressDTO(Long id, String nameStreet, Integer number, String district, String city, String state,
			String cep) {
		this.id = id;
		this.nameStreet = nameStreet;
		this.number = number;
		this.district = district;
		this.city = city;
		this.state = state;
		this.cep = cep;
	}

	public AddressDTO(Address entity) {
		id = entity.getId();
		nameStreet = entity.getNameStreet();
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

	public String getNameStreet() {
		return nameStreet;
	}

	public void setNameStreet(String nameStreet) {
		this.nameStreet = nameStreet;
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
}
