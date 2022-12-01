package com.maurocenter.almox.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_product")
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double price;
	private String barcode;
	private String description;
	
}
