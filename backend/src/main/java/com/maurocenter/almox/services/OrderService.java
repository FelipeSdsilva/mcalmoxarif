package com.maurocenter.almox.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurocenter.almox.dto.OrderDTO;
import com.maurocenter.almox.entities.Order;
import com.maurocenter.almox.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository ordRepository;
	
	public List<OrderDTO> findAll() {
		List<Order> ordList = ordRepository.findAll();
		return ordList.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}

}
