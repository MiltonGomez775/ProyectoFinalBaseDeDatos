package co.edu.uniquindio.proyecto.repository;

import co.edu.uniquindio.proyecto.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}