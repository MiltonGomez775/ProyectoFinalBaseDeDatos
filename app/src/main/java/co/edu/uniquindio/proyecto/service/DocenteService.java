package co.edu.uniquindio.proyecto.service;

import co.edu.uniquindio.proyecto.dto.DocenteDTO;

import java.util.List;

public interface DocenteService {
    List<DocenteDTO> listarDocentes();

    DocenteDTO obtenerDocentePorId(Integer id);

    DocenteDTO registrarDocente(DocenteDTO docenteDTO);

    DocenteDTO actualizarDocente(Integer id, DocenteDTO docenteDTO);

    void eliminarDocente(Integer id);
}