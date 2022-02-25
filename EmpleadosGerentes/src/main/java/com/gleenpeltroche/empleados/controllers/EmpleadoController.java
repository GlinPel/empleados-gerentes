package com.gleenpeltroche.empleados.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gleenpeltroche.empleados.services.ApiService;

@Controller
public class EmpleadoController {
	@Autowired
	ApiService apiService;
	
	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("empleadosGerente", apiService.findAllEmpleadosGerente());
		model.addAttribute("gerenteEmpleados", apiService.findAllGerentesEmpleados());
		return "index.jsp";
	}
}
