package com.maurocenter.almox.dto;

import java.io.Serializable;

import com.maurocenter.almox.dto.pk.OrderItemPKDto;
import com.maurocenter.almox.entities.OrderItem;

public class OrderItemDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private OrderItemPKDto id = new OrderItemPKDto();

	private Integer quantity;
	private Double price;

	public OrderItemDTO() {
	}

	public OrderItemDTO(OrderDTO orderDto, ProductDTO productDto, Integer quantity, Double price) {
		id.setProductDto(productDto);
		id.setOrderDto(orderDto);
		;
		this.quantity = quantity;
		this.price = price;
	}

	public OrderItemDTO(OrderItem entity) {
		
		quantity = entity.getQuantity();
		price = entity.getPrice();
		
	}

	public OrderDTO getOrderDTO() {
		return id.getOrderDto();
	}

	public void setOrderDTO(OrderDTO orderDto) {
		id.setOrderDto(orderDto);
	}

	public ProductDTO getProductDTO() {
		return id.getProductDto();
	}

	public void setProductDTO(ProductDTO productDto) {
		id.setProductDto(productDto);
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

	public Double getSubTotal() {
		return price * quantity;
	}
}
