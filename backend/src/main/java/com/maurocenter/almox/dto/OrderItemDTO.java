package com.maurocenter.almox.dto;

import java.io.Serializable;

public class OrderItemDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer quantity;
	private Double price;

	private ProductDTO product;

	public OrderItemDTO() {
	}

	public OrderItemDTO(Integer quantity, Double price, ProductDTO product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity * price;
	}
}
