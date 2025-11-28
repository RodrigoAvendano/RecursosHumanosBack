package crud.rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.rh.model.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
    
}
