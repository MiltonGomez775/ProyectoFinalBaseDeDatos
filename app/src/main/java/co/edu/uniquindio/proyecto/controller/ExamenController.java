package co.edu.uniquindio.proyecto.controller;

import co.edu.uniquindio.proyecto.dto.ExamenDTO;
import co.edu.uniquindio.proyecto.service.ExamenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/examenes")
@RequiredArgsConstructor
public class ExamenController {

    private final ExamenService examenService;

    @PostMapping
    public ExamenDTO crear(@RequestBody ExamenDTO examenDTO) {
        return examenService.crearExamen(examenDTO);
    }

    @GetMapping
    public List<ExamenDTO> listar() {
        return examenService.listarExamenes();
    }

    @GetMapping("/{id}")
    public ExamenDTO obtener(@PathVariable Integer id) {
        return examenService.obtenerExamenPorId(id);
    }
}