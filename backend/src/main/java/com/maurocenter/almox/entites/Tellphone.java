package com.maurocenter.almox.entites;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.maurocenter.almox.entites.enums.TypeTell;

@Entity
@Table(name = "tb_tellphone")
public class Tellphone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private TypeTell type;
	private String number;

	private Client client;

	private Provider provider;

	public Tellphone() {
	}

	public Tellphone(Long id, TypeTell type, String number, Client client, Provider provider) {
		super();
		this.id = id;
		this.type = type;
		this.number = number;
		this.client = client;
		this.provider = provider;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
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
		Tellphone other = (Tellphone) obj;
		return Objects.equals(id, other.id);
	}

}
