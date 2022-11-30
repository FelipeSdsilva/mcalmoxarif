package com.maurocenter.almox.dto;

import java.time.Instant;

import com.maurocenter.almox.entities.Provider;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProviderDTO {

	private Long id;
	private String nome;
	private String fantasia;
	private String email;
	private String cnpj;
	private String status;
	private String tipo;
	private String porte;
	private String situacao;
	private String natureza_juridica;
	private String abertura;
	private Instant ultima_atualizacao;
	private AddressDTO adr;
	private Integer numero;
	private String complemento;
	
	public ProviderDTO(Provider entity) {
		id = entity.getId();
		nome = entity.getName();
		fantasia = entity.getFantasy();
		email = entity.getEmail();
		cnpj = entity.getCnpj();
		status = entity.getStatus();
		tipo = entity.getType();
		porte = entity.getCarry();
		situacao = entity.getSituation();
		natureza_juridica = entity.getNature_juridique();
		abertura = entity.getOpening();
		ultima_atualizacao = entity.getLast_atualization();
		numero = entity.getNumber();
		complemento = entity.getComplement();
	}
}
