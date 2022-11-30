package com.maurocenter.almox.repositories;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.maurocenter.almox.dto.ProviderDTO;

@FeignClient(name = "receitaWs", url = "https://receitaws.com.br/v1/cnpj")
public interface ReceitaWsRepository {
	@GetMapping("/{cnpj}")
	ProviderDTO consultCnpJ(@PathVariable("cnpj") String cnpj);

}
