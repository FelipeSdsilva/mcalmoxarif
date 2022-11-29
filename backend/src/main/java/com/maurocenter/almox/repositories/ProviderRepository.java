package com.maurocenter.almox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maurocenter.almox.entities.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

}
