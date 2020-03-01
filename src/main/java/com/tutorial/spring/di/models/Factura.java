package com.tutorial.spring.di.models;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Factura {

	@Value("${factura.descripcion}")
	private String descripcion;
	
	@Autowired	
	private Cliente cliente;
	// el list se tiene que injectar desde ItemFactura. Sin embargo, no se puede
	// registrar como un component. Se tiene que
	// describir un método en el @Configuration correspondiente.
	//@Autowired
	//private List<ItemFactura> items;
	//si tuvieramos mas de una implementacion de itemfactura habia que usar @Qualifier
	
	@Autowired
	@Qualifier("itemsFacturaOficina")
	private List<ItemFactura> items;
	//si tuvieramos mas de una implementacion de itemfactura habia que usar @Qualifier
	
	@PostConstruct
	public void inicializar() {
		cliente.getNombre().concat(" ").concat("José");
		descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
	}
	
	//la desctrucción se produce cuando se baja la app del servidor.
	@PreDestroy
	public void destruir() {
		System.out.println("Factura destruida");
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
