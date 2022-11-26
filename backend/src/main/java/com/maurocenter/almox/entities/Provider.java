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
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "tb_provider")
public class Provider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String corporateName;
	private String fantasyName;

	@Column(unique = true)
	private String socialRegister;

	@Column(unique = true)
	private String email;
	private Integer number;
	
	@ManyToOne
	private List<Address> adresses = new ArrayList<>();

	@ManyToOne
	private Set<Product> products = new HashSet<>();
	
	public void convertEntityToDto (ProviderDTO dto, Provider entity) {
		entity.setCorporateName(dto.getCorporateName());
		entity.setFantasyName(dto.getFantasyName());
		entity.setSocialRegister(dto.getSocialRegister());
		entity.setEmail(dto.getEmail());
		entity.setNumber(dto.getNumber());
	}

}
