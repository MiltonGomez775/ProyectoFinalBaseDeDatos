package co.edu.uniquindio.proyecto.repository;

import co.edu.uniquindio.proyecto.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer> {
}