package co.edu.uniquindio.proyecto.service;

import co.edu.uniquindio.proyecto.dto.PreguntaDTO;

import java.util.List;

public interface PreguntaService {
    PreguntaDTO crearPregunta(PreguntaDTO preguntaDTO);

    List<PreguntaDTO> listarPreguntas();

    PreguntaDTO obtenerPreguntaPorId(Integer id);
}