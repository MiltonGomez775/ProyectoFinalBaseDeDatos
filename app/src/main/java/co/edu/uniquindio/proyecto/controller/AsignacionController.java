package co.edu.uniquindio.proyecto.controller;

import co.edu.uniquindio.proyecto.dto.AsignacionDTO;
import co.edu.uniquindio.proyecto.service.AsignacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asignaciones")
@RequiredArgsConstructor
public class AsignacionController {

    private final AsignacionService asignacionService;

    @PostMapping
    public AsignacionDTO registrar(@RequestBody AsignacionDTO dto) {
        return asignacionService.registrarAsignacion(dto);
    }

    @GetMapping
    public List<AsignacionDTO> listar() {
        return asignacionService.listarAsignaciones();
    }

    @GetMapping("/{id}")
    public AsignacionDTO obtener(@PathVariable Integer id) {
        return asignacionService.obtenerAsignacionPorId(id);
    }
}