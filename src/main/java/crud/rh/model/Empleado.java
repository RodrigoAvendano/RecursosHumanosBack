package crud.rh.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@ToString
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEmpleado;

    @Column(length = 50, nullable = false)
    String nombre;

    @Column(length = 30, nullable = false)
    String primerApellido;

    @Column(length = 30, nullable = false)
    String segundoApellido;

    @Column(length = 20, nullable = false)
    String departamento;

    @Column(nullable = false)
    Double sueldo;
}
