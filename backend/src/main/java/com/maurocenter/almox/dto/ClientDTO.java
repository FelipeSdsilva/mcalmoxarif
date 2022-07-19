package com.maurocenter.almox.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.maurocenter.almox.entities.Address;
import com.maurocenter.almox.entities.Client;
import com.maurocenter.almox.entities.enums.ClientType;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String document;
	private String email;
	private ClientType type;

	private Set<AddressDTO> addresses = new HashSet<>();

	private Set<TellphoneDTO> phones = new HashSet<>();

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
	}

	public ClientDTO(Client entity, Set<Address> addresses) {
		this(entity);
		addresses.forEach(address -> this.addresses.add(new AddressDTO(address)));
		// orders.forEach(order -> this.orders.add(new OrderDTO(order)));
		// phones.forEach(phone -> this.phones.add(new TellphoneDTO(phone)));
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

	public Set<AddressDTO> getAddresses() {
		return addresses;
	}

	public Set<TellphoneDTO> getPhones() {
		return phones;
	}

	public Set<OrderDTO> getOrders() {
		return orders;
	}
}
