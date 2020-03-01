package com.tutorial.spring.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Mi servicio complejo")
public class MiServicioComplejo implements IMiServicio{
	
	public String operacion() {		
		return "ejecutando algun proceso importante complejo";		
	}

}
