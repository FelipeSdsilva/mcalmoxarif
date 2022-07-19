package com.maurocenter.almox.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.maurocenter.almox.entities.Order;
import com.maurocenter.almox.entities.enums.OrderStatus;

public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private LocalDate moment;
	private OrderStatus status;

	public OrderDTO() {
	}

	public OrderDTO(Long id, LocalDate moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public OrderDTO(Order entity) {
		id = entity.getId() ;
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
}
