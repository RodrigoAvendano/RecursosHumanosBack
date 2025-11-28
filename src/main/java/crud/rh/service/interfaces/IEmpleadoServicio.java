package crud.rh.service.interfaces;

import java.util.List;

import crud.rh.model.Empleado;

public interface IEmpleadoServicio {
    
    public List<Empleado> listarEmpleados();

    public Empleado busEmpleadoPorId(Integer idEmpleado);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}
