package co.edu.uniquindio.proyecto.service;

import co.edu.uniquindio.proyecto.dto.ResultadoExamenDTO;

import java.util.List;

public interface ResultadoExamenService {
    ResultadoExamenDTO registrarResultado(ResultadoExamenDTO resultadoDTO);

    List<ResultadoExamenDTO> listarResultados();

    ResultadoExamenDTO obtenerResultadoPorId(Integer id);
}