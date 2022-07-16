package com.maurocenter.almox.dto;

import java.io.Serializable;

import com.maurocenter.almox.entities.Tellphone;
import com.maurocenter.almox.entities.enums.TellType;

public class TellphoneDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String number;
	private TellType tellType;

	public TellphoneDTO() {
	}

	public TellphoneDTO(Long id, String number, TellType tellType) {
		super();
		this.id = id;
		this.number = number;
		this.tellType = tellType;
	}
	
	public TellphoneDTO(Tellphone entity) {
		id = entity.getId();
		number = entity.getNumber();
		tellType = entity.getTellType();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public TellType getTellType() {
		return tellType;
	}

	public void setTellType(TellType tellType) {
		this.tellType = tellType;
	}

}
