package com.maurocenter.almox.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.maurocenter.almox.dto.ClientDTO;
import com.maurocenter.almox.entities.enums.ClientType;

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

	@Column(unique = true)
	private String document;

	@Column(unique = true)
	private String email;
	private ClientType type;
	private Integer number;
	private String complements;

	@ManyToOne
	private List<Address> adresses = new ArrayList<>();

	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private Set<Order> orders = new HashSet<>();

	public void convertEntityToDto(ClientDTO dto, Client entity) {
		entity.setName(dto.getName());
		entity.setDocument(dto.getDocument());
		entity.setEmail(dto.getEmail());
		entity.setType(dto.getType());
		entity.setNumber(dto.getNumber());

		Address adr = new Address();

		adr.covertEntityInDto(adr, dto.getAdrDto());
		entity.adresses.add(adr);
	}
}
