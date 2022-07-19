package com.maurocenter.almox.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.maurocenter.almox.entities.Address;
import com.maurocenter.almox.entities.Client;
import com.maurocenter.almox.entities.Order;
import com.maurocenter.almox.entities.Tellphone;
import com.maurocenter.almox.entities.enums.ClientType;


public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String document;
	private String email;
	private ClientType type;

	private List<AddressDTO> addresses = new ArrayList<>();

	private List<TellphoneDTO> phones = new ArrayList<>();

	private List<OrderDTO> orders = new ArrayList<>();

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

	public ClientDTO(Client entity, List<Address> addresses, List<Order> orders, List<Tellphone> phones) {
		this(entity);
		addresses.forEach(address -> this.addresses.add(new AddressDTO(address)));
		orders.forEach(order -> this.orders.add(new OrderDTO(order)));
		phones.forEach(phone -> this.phones.add(new TellphoneDTO(phone)));
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

	public List<AddressDTO> getAddresses() {
		return addresses;
	}

	public List<TellphoneDTO> getPhones() {
		return phones;
	}

	public List<OrderDTO> getOrders() {
		return orders;
	}
}
