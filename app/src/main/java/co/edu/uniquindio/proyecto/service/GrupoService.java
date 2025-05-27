package co.edu.uniquindio.proyecto.service;

import co.edu.uniquindio.proyecto.dto.GrupoDTO;

import java.util.List;

public interface GrupoService {
    GrupoDTO crearGrupo(GrupoDTO grupoDTO);

    List<GrupoDTO> listarGrupos();

    GrupoDTO obtenerGrupoPorId(Integer id);
}