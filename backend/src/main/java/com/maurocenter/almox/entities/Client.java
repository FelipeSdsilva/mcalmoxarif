package com.maurocenter.almox.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.maurocenter.almox.entities.enums.ClientType;

@Entity
@Table(name = "tb_client")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String document;
	private String email;
	private ClientType type;

	@ManyToMany
	@JoinTable(name = "tb_address_client",
	joinColumns = @JoinColumn(name = "client_id"),
	inverseJoinColumns = @JoinColumn(name = "address_id"))
	private Set<Address> addresses = new HashSet<>();

	@ManyToMany
	@JoinTable(name = "tb_phone_client",
	joinColumns = @JoinColumn(name = "client_id"),
	inverseJoinColumns = @JoinColumn(name = "phone_id"))
	private Set<Tellphone> phones = new HashSet<>();

	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private Set<Order> orders = new HashSet<>();

	public Client() {
	}

	public Client(Long id, String name, String document, String email, ClientType type) {
		this.id = id;
		this.name = name;
		this.document = document;
		this.email = email;
		this.type = type;
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

	public Set<Address> getAddresses() {
		return addresses;
	}

	public Set<Tellphone> getPhones() {
		return phones;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(id, other.id);
	}

}
