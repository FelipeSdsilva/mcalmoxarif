package com.maurocenter.almox.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.maurocenter.almox.entities.Client;
import com.maurocenter.almox.entities.Order;
import com.maurocenter.almox.entities.enums.ClientType;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String document;
	private String email;
	private ClientType type;
	private String nameStreet;
	private Integer number;
	private String district;
	private String city;
	private String state;
	private String cep;
	private String phone;

	private Set<OrderDTO> orders = new HashSet<>();

	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String document, String email, ClientType type) {
		this.id = id;
		this.name = name;
		this.document = document;
		this.email = email;
		this.type = type;
	}

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		document = entity.getDocument();
		email = entity.getEmail();
		type = entity.getType();
		nameStreet = entity.getNameStreet();
		number = entity.getNumber();
		district = entity.getDistrict();
		city = entity.getCity();
		state = entity.getState();
		cep = entity.getCep();
		phone = entity.getPhone();
		
	}

	public ClientDTO(Client entity, Set<Order> orders) {
		this(entity);
		orders.forEach(order -> this.orders.add(new OrderDTO(order)));
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

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ClientType getType() {
		return type;
	}

	public void setType(ClientType type) {
		this.type = type;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setOrders(Set<OrderDTO> orders) {
		this.orders = orders;
	}

	public Set<OrderDTO> getOrders() {
		return orders;
	}
}
