package crud.rh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.rh.model.Empleado;
import crud.rh.repositories.EmpleadoRepositorio;
import crud.rh.service.interfaces.IEmpleadoServicio;

@Service
public class EmpleadoServicio implements IEmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    @Override
    public List<Empleado> listarEmpleados() {
       return empleadoRepositorio.findAll();
    }

    @Override
    public Empleado busEmpleadoPorId(Integer idEmpleado) {
       return empleadoRepositorio.findById(idEmpleado).orElse(null);
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
       empleadoRepositorio.delete(empleado);
    }
    
}
