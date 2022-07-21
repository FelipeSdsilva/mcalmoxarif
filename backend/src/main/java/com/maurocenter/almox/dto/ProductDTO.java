package com.maurocenter.almox.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.maurocenter.almox.entities.Product;
import com.maurocenter.almox.entities.enums.TypePacking;

public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String productName;
	private String barcode;
	private LocalDate dateValidity;
	private Double price;
	private TypePacking paking;

	private Set<OrderItemDTO> items = new HashSet<>();

	private List<ProviderDTO> providers = new ArrayList<>();

	public ProductDTO() {
	}

	public ProductDTO(Long id, String productName, String barcode, LocalDate dateValidity, Double price,
			TypePacking paking) {
		this.id = id;
		this.productName = productName;
		this.barcode = barcode;
		this.dateValidity = dateValidity;
		this.price = price;
		this.paking = paking;
	}

	public ProductDTO(Product entity) {
		id = entity.getId();
		productName = entity.getProductName();
		barcode = entity.getBarcode();
		dateValidity = entity.getDateValidity();
		price = entity.getPrice();
		paking = entity.getPaking();
	}

	public ProductDTO(Product entity, Set<OrderItemDTO> items, List<ProviderDTO> providers) {
		this(entity);

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
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

	public Set<OrderItemDTO> getItems() {
		return items;
	}

	public List<ProviderDTO> getProviders() {
		return providers;
	}
}
