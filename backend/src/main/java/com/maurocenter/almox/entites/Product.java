package com.maurocenter.almox.entites;

import java.io.Serializable;
import java.time.Instant;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String barcode;
	private Instant validaty;
}
