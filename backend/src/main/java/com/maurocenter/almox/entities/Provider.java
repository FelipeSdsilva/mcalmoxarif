package com.maurocenter.almox.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private String nameStreet;
	private Integer number;
	private String district;
	private String city;
	private String state;
	private String cep;
	private String phone;

	@OneToMany(mappedBy = "provider")
	private Set<Product> products = new HashSet<>();

	public Provider() {
	}

	public Provider(Long id, String corporateName, String fantasyName, String socialRegister, String email,
			String nameStreet, Integer number, String district, String city, String state, String cep, String phone) {
		this.id = id;
		this.corporateName = corporateName;
		this.fantasyName = fantasyName;
		this.socialRegister = socialRegister;
		this.email = email;
		this.nameStreet = nameStreet;
		this.number = number;
		this.district = district;
		this.city = city;
		this.state = state;
		this.cep = cep;
		this.phone = phone;
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

	public Set<Product> getProducts() {
		return products;
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
