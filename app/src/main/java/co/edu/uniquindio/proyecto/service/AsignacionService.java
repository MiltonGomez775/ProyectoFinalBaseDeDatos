package co.edu.uniquindio.proyecto.service;

import co.edu.uniquindio.proyecto.dto.AsignacionDTO;

import java.util.List;

public interface AsignacionService {
    AsignacionDTO registrarAsignacion(AsignacionDTO dto);

    AsignacionDTO obtenerAsignacionPorId(Integer id);

    List<AsignacionDTO> listarAsignaciones();
}