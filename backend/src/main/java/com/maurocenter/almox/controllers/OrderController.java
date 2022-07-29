package com.maurocenter.almox.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurocenter.almox.dto.OrderDTO;
import com.maurocenter.almox.services.OrderService;

@RestController
@RequestMapping(value ="/orders")
public class OrderController {

	@Autowired
	private OrderService ordService;
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAllOrder(){
		List<OrderDTO> ordList = ordService.findAll();
		return ResponseEntity.ok().body(ordList);
	}
}
