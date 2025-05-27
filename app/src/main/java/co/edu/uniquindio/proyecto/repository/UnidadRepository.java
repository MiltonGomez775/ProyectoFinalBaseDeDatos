package co.edu.uniquindio.proyecto.repository;

import co.edu.uniquindio.proyecto.model.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadRepository extends JpaRepository<Unidad, Integer> {
}