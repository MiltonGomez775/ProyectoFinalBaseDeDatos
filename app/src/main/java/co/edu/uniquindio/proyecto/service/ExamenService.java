package co.edu.uniquindio.proyecto.service;

import co.edu.uniquindio.proyecto.dto.ExamenDTO;

import java.util.List;

public interface ExamenService {
    ExamenDTO crearExamen(ExamenDTO examenDTO);

    List<ExamenDTO> listarExamenes();

    ExamenDTO obtenerExamenPorId(Integer id);
}