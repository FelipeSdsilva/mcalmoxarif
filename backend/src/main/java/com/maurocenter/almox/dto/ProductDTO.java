package com.maurocenter.almox.dto;

import java.io.Serializable;
import java.time.Instant;

import com.maurocenter.almox.entites.Product;

public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String barcode;
	private Instant validaty;
	private Double price;
	private Integer quantity;

	private ProviderDTO provider;

	public ProductDTO() {
	}

	public ProductDTO(Long id, String name, String barcode, Instant validaty, Double price, Integer quantity,
			ProviderDTO provider) {
		super();
		this.id = id;
		this.name = name;
		this.barcode = barcode;
		this.validaty = validaty;
		this.price = price;
		this.quantity = quantity;
		this.provider = provider;
	}

	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		barcode = entity.getBarcode();
		validaty = entity.getValidaty();
		price = entity.getPrice();
		quantity = entity.getQuantity();
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

	public Instant getValidaty() {
		return validaty;
	}

	public void setValidaty(Instant validaty) {
		this.validaty = validaty;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public ProviderDTO getProvider() {
		return provider;
	}

	public void setProvider(ProviderDTO provider) {
		this.provider = provider;
	}

}
