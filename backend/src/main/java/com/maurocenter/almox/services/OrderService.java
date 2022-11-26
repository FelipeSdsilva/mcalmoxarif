package com.maurocenter.almox.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maurocenter.almox.dto.OrderDTO;
import com.maurocenter.almox.dto.OrderItemDTO;
import com.maurocenter.almox.entities.Client;
import com.maurocenter.almox.entities.Order;
import com.maurocenter.almox.repositories.OrderItemRepository;
import com.maurocenter.almox.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository ordRepository;

	@SuppressWarnings("unused")
	@Autowired
	private OrderItemRepository itemRepository;

	public List<OrderDTO> findAll() {
		List<Order> ordList = ordRepository.findAll();
		return ordList.stream().map(OrderDTO::new).toList();
	}

	@Transactional
	public OrderDTO insertOrder(OrderDTO dto) {
		Order entity = new Order();
		insertToOrder(dto, entity);
		entity = ordRepository.save(entity);
		return new OrderDTO(entity);
	}

	private void insertToOrder(OrderDTO dto, Order entity) {
		entity.setStatus(dto.getStatus());
		entity.setMoment(LocalDate.now());
		
		Client client = new Client();
		
		client.setId(dto.getClientId());
		entity.setClient(client);
		
		entity.getItems().clear();
		for(@SuppressWarnings("unused") OrderItemDTO ordDto : dto.getItems()) {
			//OrderItem item = OrderItemRepository.(ordDto.getProductDTO()) 
		}
	}
}
