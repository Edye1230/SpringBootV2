package com.gestionempleados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gestionempleados.models.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
    
    

}
