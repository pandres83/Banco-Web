package co.edu.usbcali.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.demo.dto.Resultado;

@RestController
@RequestMapping("/calculadora")
public class OperacionesMatematicas {
	
	@GetMapping("/sumar/{n1}/{n2}")
	public Resultado sumar(@PathVariable("n1") Integer n1, @PathVariable("n2") Integer n2){
		Resultado resultado=new Resultado();
		resultado.setValor(n1+n2);
		return resultado;
	}
	
	@GetMapping("/restar/{n1}/{n2}")
	public Resultado restar(@PathVariable("n1") Integer n1, @PathVariable("n2") Integer n2){
		Resultado resultado=new Resultado();
		resultado.setValor(n1-n2);
		return resultado;
	}
	
	@GetMapping("/mult/{n1}/{n2}")
	public Resultado mult(@PathVariable("n1") Integer n1, @PathVariable("n2") Integer n2){
		Resultado resultado=new Resultado();
		resultado.setValor(n1*n2);
		return resultado;
	}

}
