package com.maurocenter.almox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maurocenter.almox.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
