package com.tutorial.spring.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tutorial.spring.di.services.IMiServicio;
import com.tutorial.spring.di.services.MiServicio;

@Controller
public class IndexController {
	
	//la utilización de la injección de la interfaz en vez de la clase permite desacoplar la clase controlador con la 
	//de servicio. Sino cada vez que tenemos que cambiar la clase implementación, tendrías que cambiar la controladora.
	//si hay una sola implementación, utilizará la primera que encuentre. Sino hay que aclararlo.
	//se puede injectar también mediante constructor, o bien, mediante setter.
	//O sea, se puede mediante atributo, constructor o setter
	@Autowired
	//El @Qualifier es utilizado para detetrminar cuál de todas las clases que implementan la interfaz es la que queremos utilizar.
	//en su parámetro se indica el nombre del componente de la clase.
	@Qualifier("Mi servicio complejo")
	private IMiServicio servicio;	
	
//	@Autowired
//	public IndexController(IMiServicio servicio) {
//		super();
//		this.servicio = servicio;
//	}

	@GetMapping({"/", "/index"})
	public String index(Model model) {
		model.addAttribute("Objeto", servicio.operacion());		
		return "index";
	}

//	@Autowired
//	public void setServicio(IMiServicio servicio) {
//		this.servicio = servicio;
//	}

}
