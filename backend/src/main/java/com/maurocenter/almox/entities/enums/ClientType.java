package com.maurocenter.almox.entities.enums;

public enum ClientType {

	CPF(1),
	CNPJ(2);
	
	private int code;
	
	private ClientType(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static ClientType valueOf(int code) {
		for(ClientType value : ClientType.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid client type");
	}
}
