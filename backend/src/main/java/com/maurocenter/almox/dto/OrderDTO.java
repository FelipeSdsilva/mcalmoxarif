package com.maurocenter.almox.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.maurocenter.almox.entites.enums.OrderStatus;

public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Instant date;
	private OrderStatus status;

	private ClientDTO client;

	List<OrderItemDTO> items = new ArrayList<>();

	public OrderDTO() {
	}

	public OrderDTO(Long id, Instant date, OrderStatus status, ClientDTO client) {
		super();
		this.id = id;
		this.date = date;
		this.status = status;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
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

	public List<OrderItemDTO> getItems() {
		return items;
	}

}
