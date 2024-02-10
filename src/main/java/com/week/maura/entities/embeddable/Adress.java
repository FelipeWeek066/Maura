package com.week.maura.entities.embeddable;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adress implements Serializable{
	private static final long serialVersionUID = 1L;
	private Double latitud;
	private Double longitud;
	private String street;
	private int number;
	private String district;
	private String city;
}
