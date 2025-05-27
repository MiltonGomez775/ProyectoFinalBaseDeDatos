package co.edu.uniquindio.proyecto.repository;

import co.edu.uniquindio.proyecto.model.BancoDePreguntas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoDePreguntasRepository extends JpaRepository<BancoDePreguntas, Integer> {
}