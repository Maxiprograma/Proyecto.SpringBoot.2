package com.gestion.empleados.excepsiones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException {
	private static final long serialVersionID = 1L;

	public ResourceNotFoundException(String mensaje) {
		super();

	}
}
