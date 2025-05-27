package co.edu.uniquindio.proyecto.repository;

import co.edu.uniquindio.proyecto.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}