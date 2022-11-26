package com.maurocenter.almox.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.maurocenter.almox.entities.Order;
import com.maurocenter.almox.entities.OrderItem;
import com.maurocenter.almox.entities.enums.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private LocalDate moment;
	private OrderStatus status;
	public Double total;
	private Long clientId;

	private Set<OrderItemDTO> items = new HashSet<>();

	public OrderDTO(Order entity) {
		id = entity.getId();
		moment = entity.getMoment();
		status = entity.getStatus();
		total = entity.getTotal();
		clientId = entity.getClient().getId();	
	}

	public OrderDTO(Order entity, Set<OrderItem> items) {
		this(entity);
		items.forEach(item -> this.items.add(new OrderItemDTO(item)));
	}


	public Double getTotal() {
		double sum = 0.0;
		for (OrderItemDTO orderItemDTO : items) {
			sum += orderItemDTO.getSubTotal();
		}
		return sum;
	}
}
