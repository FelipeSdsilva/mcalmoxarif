package com.maurocenter.almox.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.maurocenter.almox.entities.enums.TellType;

@Entity
@Table(name = "tb_tellphone")
public class Tellphone implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String number;
	private TellType tellType;
	
	@ManyToMany(mappedBy = "phones")
	private Client client;

	@ManyToMany(mappedBy = "phones")
	private Provider provider;
	
	public Tellphone() {
	}

	public Tellphone(Long id, String number, TellType tellType) {
		this.id = id;
		this.number = number;
		this.tellType = tellType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public TellType getTellType() {
		return tellType;
	}

	public void setTellType(TellType tellType) {
		this.tellType = tellType;
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
