package com.maurocenter.almox.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.maurocenter.almox.entities.Product;
import com.maurocenter.almox.entities.enums.TypePacking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String barcode;
	private Integer quantityEst;
	private LocalDate dateValidity;
	private Double price;
	private TypePacking paking;
	private Long providerId;

	private Set<OrderItemDTO> items = new HashSet<>();

	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		barcode = entity.getBarcode();
		quantityEst = entity.getQuantityEst();
		dateValidity = entity.getDateValidity();
		price = entity.getPrice();
		paking = entity.getPaking();
		providerId = entity.getProvider().getId();
	}


	public Set<OrderDTO> getOrders() {
		Set<OrderDTO> set = new HashSet<>();
		for (OrderItemDTO order : items) {
			set.add(order.getOrderDTO());
		}
		return set;
	}
}
