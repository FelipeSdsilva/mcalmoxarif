package com.maurocenter.almox.dto.pk;

import java.io.Serializable;

import com.maurocenter.almox.dto.OrderDTO;
import com.maurocenter.almox.dto.ProductDTO;

public class OrderItemPKDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private OrderDTO orderDto;
	private ProductDTO productDto;
	
	public OrderDTO getOrderDto() {
		return orderDto;
	}
	
	public void setOrderDto(OrderDTO orderDto) {
		this.orderDto = orderDto;
	}
	
	public ProductDTO getProductDto() {
		return productDto;
	}
	
	public void setProductDto(ProductDTO productDto) {
		this.productDto = productDto;
	}
}
