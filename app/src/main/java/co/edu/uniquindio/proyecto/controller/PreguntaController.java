package co.edu.uniquindio.proyecto.controller;

import co.edu.uniquindio.proyecto.dto.PreguntaDTO;
import co.edu.uniquindio.proyecto.service.PreguntaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/preguntas")
@RequiredArgsConstructor
public class PreguntaController {

    private final PreguntaService preguntaService;

    @PostMapping
    public PreguntaDTO crear(@RequestBody PreguntaDTO preguntaDTO) {
        return preguntaService.crearPregunta(preguntaDTO);
    }

    @GetMapping
    public List<PreguntaDTO> listar() {
        return preguntaService.listarPreguntas();
    }

    @GetMapping("/{id}")
    public PreguntaDTO obtener(@PathVariable Integer id) {
        return preguntaService.obtenerPreguntaPorId(id);
    }
}