package com.tutorial.spring.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Mi servicio simple")
//la anotación primary sirve para indicar cuál es la clase que implementa por defecto la interfaz.
@Primary
public class MiServicio implements IMiServicio{
	
	public String operacion() {		
		return "ejecutando algun proceso simple";		
	}

}
