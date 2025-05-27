package co.edu.uniquindio.proyecto.service;

import co.edu.uniquindio.proyecto.dto.CursoDTO;

import java.util.List;

public interface CursoService {
    CursoDTO crearCurso(CursoDTO cursoDTO);

    List<CursoDTO> listarCursos();

    CursoDTO obtenerCursoPorId(Integer id);
}