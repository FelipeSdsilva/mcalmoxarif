package com.maurocenter.almox.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurocenter.almox.dto.ProductDTO;
import com.maurocenter.almox.entities.Product;
import com.maurocenter.almox.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<ProductDTO> findAllProd() {
		List<Product> listP = repository.findAll();
		return listP.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

	public ProductDTO insertProduct(ProductDTO dto) {
		Product entity = new Product();
		insertToProduct(dto, entity);
		return new ProductDTO(entity);
	}
	
	private void insertToProduct(ProductDTO dto, Product entity) {
		entity.setName(dto.getName());
		entity.setBarcode(dto.getBarcode());
		entity.setQuantityEst(dto.getQuantityEst());
		entity.setDateValidity(dto.getDateValidity());
		entity.setPrice(dto.getPrice());
		entity.setPaking(dto.getPaking());
	}
	
}
