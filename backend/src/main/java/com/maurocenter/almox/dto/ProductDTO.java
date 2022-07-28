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
	private String name;
	private String barcode;
	private Integer quantityEst;
	private LocalDate dateValidity;
	private Double price;
	private TypePacking paking;

	private Set<OrderItemDTO> items = new HashSet<>();

	private List<ProviderDTO> providers = new ArrayList<>();

	public ProductDTO() {
	}

	public ProductDTO(Long id, String name, String barcode, Integer quantityEst, LocalDate dateValidity, Double price,
			TypePacking paking) {
		this.id = id;
		this.name = name;
		this.barcode = barcode;
		this.quantityEst = quantityEst;
		this.dateValidity = dateValidity;
		this.price = price;
		this.paking = paking;
	}

	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		barcode = entity.getBarcode();
		quantityEst = entity.getQuantityEst();
		dateValidity = entity.getDateValidity();
		price = entity.getPrice();
		paking = entity.getPaking();
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

	public Set<OrderItemDTO> getItems() {
		return items;
	}

	public List<ProviderDTO> getProviders() {
		return providers;
	}

	public Set<OrderDTO> getOrders() {
		Set<OrderDTO> set = new HashSet<>();
		for (OrderItemDTO order : items) {
			set.add(order.getOrderDTO());
		}
		return set;
	}
}
