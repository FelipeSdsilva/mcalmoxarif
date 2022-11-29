package com.maurocenter.almox.repository.exceptions;

import java.io.Serializable;
import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;

	private Instant timeStamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
	
}
