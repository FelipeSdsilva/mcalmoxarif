package com.maurocenter.almox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maurocenter.almox.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
