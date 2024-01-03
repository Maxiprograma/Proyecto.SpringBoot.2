package com.gestion.empleados.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.empleados.modelos.Empleado;
import com.gestion.empleados.repositorio.EmpleadoRepositorio;

@RestController
@RequestMapping("/api/v1/")
public class EmpleadoControlador {
	@Autowired
	private EmpleadoRepositorio repositorio;

	@GetMapping("/empledos")
	public List<Empleado> listarTodoslosEmpleados() {
		return repositorio.findAll();

	}
}
