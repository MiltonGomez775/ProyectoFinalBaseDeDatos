package co.edu.uniquindio.proyecto.repository;

import co.edu.uniquindio.proyecto.model.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Integer> {
}