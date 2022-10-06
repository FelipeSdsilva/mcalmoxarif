package com.maurocenter.almox.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maurocenter.almox.dto.OrderDTO;
import com.maurocenter.almox.entities.Order;
import com.maurocenter.almox.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> ordList = orderRepository.findAll();
		return ordList.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}

	public OrderDTO insertNewOrder(OrderDTO dto) {
		Order entity = new Order();
		insertToOrder(dto,entity);
		entity = orderRepository.save(entity);
		return null;
	}

	private void insertToOrder(OrderDTO dto, Order entity) {
		entity.getMoment();
		entity.getStatus();
		
		
	}

}
