package com.example.demo.services;

import com.example.demo.dao.EmpleadoRepository;
import com.example.demo.models.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EmpleadoServiceImpl implements  EmpleadoServiceInterface{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleado saveEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado findById(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public Empleado update(Empleado empleado, Long id) {
        Empleado empleado1= new Empleado();
        empleado1 = empleadoRepository.findById(id).get();

        empleado1.setId(id);
        empleado1.setName(empleado.getName());
        empleado1.setApellido(empleado.getApellido());

        return empleadoRepository.save(empleado1);
    }

    @Override
    public void delete(Empleado empleado) {
        empleadoRepository.delete(empleado);
    }
}
