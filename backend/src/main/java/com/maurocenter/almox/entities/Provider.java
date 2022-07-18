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
	private Product product;

	@ManyToMany
	@JoinTable(name = "tb_address_provider",
	joinColumns = @JoinColumn(name = "provider_id"),
	inverseJoinColumns = @JoinColumn(name = "address_id"))
	private Set<Address> addresses = new HashSet<>();

	@ManyToMany
	@JoinTable(name = "tb_phone_provider",
	joinColumns = @JoinColumn(name = "provider_id"),
	inverseJoinColumns = @JoinColumn(name = "phone_id"))
	private Set<Tellphone> phones = new HashSet<>();

	public Provider() {
	}

	public Provider(Long id, String corporateName, String fantasyName, String socialRegister, String email,
			Product product) {
		super();
		this.id = id;
		this.corporateName = corporateName;
		this.fantasyName = fantasyName;
		this.socialRegister = socialRegister;
		this.email = email;
		this.product = product;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public Set<Tellphone> getPhones() {
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
