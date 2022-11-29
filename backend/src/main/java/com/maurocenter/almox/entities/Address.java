package com.maurocenter.almox.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.maurocenter.almox.dto.AddressDTO;

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
@Table(name = "tb_address")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameStreet;
	private String district;
	private String city;
	private String state;
	
	@Column(unique = true)
	private String cep;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	public void convertDtoInEntity(Address entity, AddressDTO adrDto) {
			entity.setNameStreet(adrDto.getLogradouro());
			entity.setDistrict(adrDto.getBairro());
			entity.setCity(adrDto.getLocalidade());
			entity.setState(adrDto.getUf());
			entity.setCep(adrDto.getCep());
	}
}
