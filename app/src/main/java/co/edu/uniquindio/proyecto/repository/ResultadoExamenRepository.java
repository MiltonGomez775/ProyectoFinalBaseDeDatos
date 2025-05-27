package co.edu.uniquindio.proyecto.repository;

import co.edu.uniquindio.proyecto.model.ResultadoExamen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultadoExamenRepository extends JpaRepository<ResultadoExamen, Integer> {
}