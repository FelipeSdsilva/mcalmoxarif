package com.maurocenter.almox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maurocenter.almox.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

	Address findByCep(String cep);
}
