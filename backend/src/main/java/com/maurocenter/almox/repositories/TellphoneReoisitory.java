package com.maurocenter.almox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maurocenter.almox.entities.Tellphone;

@Repository
public interface TellphoneReoisitory extends JpaRepository<Tellphone, Long> {


	
}
