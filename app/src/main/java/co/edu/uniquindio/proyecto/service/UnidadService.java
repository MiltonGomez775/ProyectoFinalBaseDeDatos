package co.edu.uniquindio.proyecto.service;

import co.edu.uniquindio.proyecto.dto.UnidadDTO;

import java.util.List;

public interface UnidadService {
    UnidadDTO crearUnidad(UnidadDTO unidadDTO);

    List<UnidadDTO> listarUnidades();

    UnidadDTO obtenerUnidadPorId(Integer id);
}