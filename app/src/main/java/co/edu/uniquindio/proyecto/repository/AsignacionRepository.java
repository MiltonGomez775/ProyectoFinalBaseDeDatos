package co.edu.uniquindio.proyecto.repository;

import co.edu.uniquindio.proyecto.model.AsignacionGrupoCursoUnidadDocente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignacionRepository extends JpaRepository<AsignacionGrupoCursoUnidadDocente, Integer> {
}