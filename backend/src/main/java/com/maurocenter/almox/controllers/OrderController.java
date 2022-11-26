package com.maurocenter.almox.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.maurocenter.almox.dto.OrderDTO;
import com.maurocenter.almox.services.OrderService;

@RestController
@RequestMapping(value ="/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAllOrder(){
		List<OrderDTO> ordList = orderService.findAll();
		return ResponseEntity.ok().body(ordList);
	}
	
	@PutMapping
	public ResponseEntity<OrderDTO> newOrder(@RequestBody OrderDTO dto){
		dto = orderService.insertNewOrder(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId())
				.toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}
