package com.maurocenter.almox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maurocenter.almox.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


}
