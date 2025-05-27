package co.edu.uniquindio.proyecto.service;

import co.edu.uniquindio.proyecto.dto.EstudianteDTO;

import java.util.List;

public interface EstudianteService {
    EstudianteDTO registrarEstudiante(EstudianteDTO dto);

    EstudianteDTO obtenerEstudiantePorId(Integer id);

    List<EstudianteDTO> listarEstudiantes();
}