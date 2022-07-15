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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_provider")
public class Provider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String corporateName;
	private String fantasyName;
	private String socialRegister;
	private String email;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private List<Product> products = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "tb_provider_address", joinColumns = @JoinColumn(name = "localization_id"), inverseJoinColumns = {
			@JoinColumn(name = "provider_id"), @JoinColumn(name = "address_id") })
	private List<Address> addresses = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "tb_provider_phone", joinColumns = @JoinColumn(name = "contaticlist_id"), inverseJoinColumns = {
			@JoinColumn(name = "provider_id"), @JoinColumn(name = "tellphone_id") })
	private List<Tellphone> phones = new ArrayList<>();

	public Provider() {
	}

	public Provider(Long id, String corporateName, String fantasyName, String socialRegister, String email) {
		super();
		this.id = id;
		this.corporateName = corporateName;
		this.fantasyName = fantasyName;
		this.socialRegister = socialRegister;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public String getFantasyName() {
		return fantasyName;
	}

	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}

	public String getSocialRegister() {
		return socialRegister;
	}

	public void setSocialRegister(String socialRegister) {
		this.socialRegister = socialRegister;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Product> getProducts() {
		return products;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public List<Tellphone> getPhones() {
		return phones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fantasyName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provider other = (Provider) obj;
		return Objects.equals(fantasyName, other.fantasyName);
	}
}
