package com.example.demo.controller;

import com.example.demo.models.Empleado;
import com.example.demo.services.EmpleadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoServiceImpl empleadoService;

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveEmpleado(@RequestBody Empleado empleado){
        return new ResponseEntity<>(empleadoService.saveEmpleado(empleado), HttpStatus.CREATED);
    }
}
