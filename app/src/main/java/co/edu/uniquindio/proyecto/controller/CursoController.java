package co.edu.uniquindio.proyecto.controller;

import co.edu.uniquindio.proyecto.dto.CursoDTO;
import co.edu.uniquindio.proyecto.service.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
@RequiredArgsConstructor
public class CursoController {

    private final CursoService cursoService;

    @PostMapping
    public CursoDTO crear(@RequestBody CursoDTO dto) {
        return cursoService.crearCurso(dto);
    }

    @GetMapping
    public List<CursoDTO> listar() {
        return cursoService.listarCursos();
    }

    @GetMapping("/{id}")
    public CursoDTO obtener(@PathVariable Integer id) {
        return cursoService.obtenerCursoPorId(id);
    }
}