package com.maurocenter.almox.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.maurocenter.almox.dto.ClientDTO;
import com.maurocenter.almox.entities.enums.TypeClient;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "tb_client")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String lastName;
	
	@Column(unique = true)
	private String email;
	
	@Column(unique = true)
	private String document;
	private TypeClient type;
	private Integer number;
	private String complement;

	public void convertDtoToEntity(Client entity, ClientDTO cliDto) {
		entity.setName(cliDto.getName());;
		entity.setLastName(cliDto.getLastName());;
		entity.setEmail(cliDto.getEmail());
		entity.setDocument(cliDto.getDocument());
		entity.setType(cliDto.getType());
		entity.setNumber(cliDto.getNumber());
		entity.setComplement(cliDto.getComplement());
	}
}
