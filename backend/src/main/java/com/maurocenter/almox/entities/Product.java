package com.maurocenter.almox.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.maurocenter.almox.entities.enums.TypePacking;

@Entity
@Table(name = "tb_product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String barcode;
	private Integer quantityEst;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDate dateValidity;
	private Double price;
	private TypePacking paking;

	@OneToMany(mappedBy = "id.product")
	private Set<OrderItem> items = new HashSet<>();

	@OneToMany(mappedBy = "product")
	private List<Provider> providers = new ArrayList<>();

	public Product() {
	}

	public Product(Long id, String name, String barcode, Integer quantityEst, LocalDate dateValidity, Double price,
			TypePacking paking) {
		this.id = id;
		this.name = name;
		this.barcode = barcode;
		this.quantityEst = quantityEst;
		this.dateValidity = dateValidity;
		this.price = price;
		this.paking = paking;
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

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Integer getQuantityEst() {
		return quantityEst;
	}

	public void setQuantityEst(Integer quantityEst) {
		this.quantityEst = quantityEst;
	}

	public LocalDate getDateValidity() {
		return dateValidity;
	}

	public void setDateValidity(LocalDate dateValidity) {
		this.dateValidity = dateValidity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public TypePacking getPaking() {
		return paking;
	}

	public void setPaking(TypePacking paking) {
		this.paking = paking;
	}

	public Set<OrderItem> getItems() {
		return items;
	}

	public List<Provider> getProviders() {
		return providers;
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
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}
}
