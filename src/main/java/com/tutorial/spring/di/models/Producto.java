package com.tutorial.spring.di.models;

public class Producto {
	
	public Producto(String nombre, Integer precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	private String nombre;
	private Integer precio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

}
