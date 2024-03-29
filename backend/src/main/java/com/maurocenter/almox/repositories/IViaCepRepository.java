package com.maurocenter.almox.repositories;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.maurocenter.almox.dto.AddressDTO;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface IViaCepRepository {
	@GetMapping("/{cep}/json")
	AddressDTO consultCep(@PathVariable("cep") String cep);
}
