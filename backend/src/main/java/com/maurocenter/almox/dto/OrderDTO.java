package com.maurocenter.almox.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.maurocenter.almox.entities.Order;
import com.maurocenter.almox.entities.enums.OrderStatus;

public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private LocalDate moment;
	private OrderStatus status;

	private ClientDTO client;

	private Set<OrderItemDTO> items = new HashSet<>();

	public OrderDTO() {
	}

	public OrderDTO(Long id, LocalDate moment, OrderStatus status, ClientDTO client) {
		super();
		this.id = id;
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public OrderDTO(Order entity) {
		id = entity.getId();
		moment = entity.getMoment();
		status = entity.getStatus();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public ClientDTO getClient() {
		return client;
	}

	public void setClient(ClientDTO client) {
		this.client = client;
	}

	public Set<OrderItemDTO> getItems() {
		return items;
	}
	
	public Double getTotal() {
		double sum = 0.0;
		for (OrderItemDTO orderItemDTO : items) {
			 sum += orderItemDTO.getSubTotal();
		}
		return sum;
	}
}
