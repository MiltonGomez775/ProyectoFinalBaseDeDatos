package co.edu.uniquindio.proyecto.controller;

import co.edu.uniquindio.proyecto.dto.UnidadDTO;
import co.edu.uniquindio.proyecto.service.UnidadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/unidades")
@RequiredArgsConstructor
public class UnidadController {

    private final UnidadService unidadService;

    @PostMapping
    public UnidadDTO crear(@RequestBody UnidadDTO dto) {
        return unidadService.crearUnidad(dto);
    }

    @GetMapping
    public List<UnidadDTO> listar() {
        return unidadService.listarUnidades();
    }

    @GetMapping("/{id}")
    public UnidadDTO obtener(@PathVariable Integer id) {
        return unidadService.obtenerUnidadPorId(id);
    }
}