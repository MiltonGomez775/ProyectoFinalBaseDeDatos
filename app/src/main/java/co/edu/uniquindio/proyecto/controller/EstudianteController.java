package co.edu.uniquindio.proyecto.controller;

import co.edu.uniquindio.proyecto.dto.EstudianteDTO;
import co.edu.uniquindio.proyecto.service.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
@RequiredArgsConstructor
public class EstudianteController {

    private final EstudianteService estudianteService;

    @PostMapping
    public EstudianteDTO registrar(@RequestBody EstudianteDTO dto) {
        return estudianteService.registrarEstudiante(dto);
    }

    @GetMapping
    public List<EstudianteDTO> listar() {
        return estudianteService.listarEstudiantes();
    }

    @GetMapping("/{id}")
    public EstudianteDTO obtener(@PathVariable Integer id) {
        return estudianteService.obtenerEstudiantePorId(id);
    }
}