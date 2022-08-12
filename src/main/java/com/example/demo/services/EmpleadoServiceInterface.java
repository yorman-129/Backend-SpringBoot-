package com.example.demo.services;

import com.example.demo.models.Empleado;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

public interface EmpleadoServiceInterface {

    public Empleado saveEmpleado(Empleado empleado);
    public Empleado findById(Long id);
    public Empleado update(Empleado empleado, Long id);
    public void delete(Empleado empleado);
}
