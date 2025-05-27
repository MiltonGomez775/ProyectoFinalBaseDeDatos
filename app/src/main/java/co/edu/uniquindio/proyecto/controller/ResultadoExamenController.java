package co.edu.uniquindio.proyecto.controller;

import co.edu.uniquindio.proyecto.dto.ResultadoExamenDTO;
import co.edu.uniquindio.proyecto.service.ResultadoExamenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resultados")
@RequiredArgsConstructor
public class ResultadoExamenController {

    private final ResultadoExamenService resultadoService;

    @PostMapping
    public ResultadoExamenDTO registrar(@RequestBody ResultadoExamenDTO dto) {
        return resultadoService.registrarResultado(dto);
    }

    @GetMapping
    public List<ResultadoExamenDTO> listar() {
        return resultadoService.listarResultados();
    }

    @GetMapping("/{id}")
    public ResultadoExamenDTO obtener(@PathVariable Integer id) {
        return resultadoService.obtenerResultadoPorId(id);
    }
}