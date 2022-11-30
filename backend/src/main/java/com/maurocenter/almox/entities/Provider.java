package com.maurocenter.almox.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.maurocenter.almox.dto.ProviderDTO;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "tb_provider")
public class Provider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String fantasy;
	private String email;
	private String cnpj;
	private String status;
	private String type;
	private String carry;
	private String situation;
	private String nature_juridique;
	private String opening;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant last_atualization;
	private Integer number;
	private String complement;

	public void convertDtoInEntity(Provider entity, ProviderDTO provDto) {
		entity.setName(provDto.getNome());
		entity.setFantasy(provDto.getFantasia());
		entity.setEmail(provDto.getEmail());
		entity.setCnpj(provDto.getCnpj());
		entity.setStatus(provDto.getStatus());
		entity.setType(provDto.getTipo());
		entity.setCarry(provDto.getPorte());
		entity.setSituation(provDto.getSituacao());
		entity.setNature_juridique(provDto.getNatureza_juridica());
		entity.setOpening(provDto.getAbertura());
		entity.setLast_atualization(provDto.getUltima_atualizacao());
		entity.setNumber(provDto.getNumero());
		entity.setComplement(provDto.getComplemento());
	}
}
