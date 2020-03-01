package com.tutorial.spring.di;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorial.spring.di.models.ItemFactura;
import com.tutorial.spring.di.models.Producto;
import com.tutorial.spring.di.services.IMiServicio;
import com.tutorial.spring.di.services.MiServicio;
import com.tutorial.spring.di.services.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	//los métodos crean los componentes y retorna la instancia.
	//el @Bean sirve para incorporar un nuevo componente en el contenedor de spring.
//	@Bean("Mi servicio simple")
//	public IMiServicio registrarMiServicio() {		
//		return new MiServicio();
//	}
//	
//	
//	@Bean("Mi servicio complejo")
//	public IMiServicio registrarMiServicioComplejo() {		
//		return new MiServicioComplejo();
//	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Bicicleta", 1500);
		Producto producto2 = new Producto("Cubierta", 500);
		
		ItemFactura item1 = new ItemFactura(producto1, 2);
		ItemFactura item2 = new ItemFactura(producto2, 2);
		
		return Arrays.asList(item1, item2);	
	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 = new Producto("Carpeta", 200);
		Producto producto2 = new Producto("Lapicera", 25);
		
		ItemFactura item1 = new ItemFactura(producto1, 2);
		ItemFactura item2 = new ItemFactura(producto2, 2);
		
		return Arrays.asList(item1, item2);	
	}

}
