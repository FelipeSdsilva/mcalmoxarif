package com.maurocenter.almox.entities.enums;

public enum OrderStatus {
	PROCESSANDO(1), 
	SEPARANDO(2), 
	SAIU_DO_DEPOSITO(3), 
	ENTREGUE(4), 
	CANCELADO(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}	 
		}
		throw new IllegalArgumentException("Invalid status code");
	}
}