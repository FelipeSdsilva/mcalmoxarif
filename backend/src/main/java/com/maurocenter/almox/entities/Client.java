package com.maurocenter.almox.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

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
	@JoinTable(name = "tb_client_address", 
	joinColumns = @JoinColumn(name = "localization_id"),
	inverseJoinColumns = {
			@JoinColumn(name = "client_id"),
			@JoinColumn(name = "address_id")
	})
	private List<Address> addresses = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "tb_provider_phone", 
	joinColumns = @JoinColumn(name = "contaticlist_id"),
	inverseJoinColumns = {
			@JoinColumn(name = "client_id"),
			@JoinColumn(name = "tellphone_id")
	})
	private List<Tellphone> phones = new ArrayList<>();
	
	public Client() {
	}

	public Client(Long id, String name, String document, String email, ClientType type) {
		super();
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
