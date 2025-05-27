package co.edu.uniquindio.proyecto.controller;

import co.edu.uniquindio.proyecto.dto.GrupoDTO;
import co.edu.uniquindio.proyecto.service.GrupoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grupos")
@RequiredArgsConstructor
public class GrupoController {

    private final GrupoService grupoService;

    @PostMapping
    public GrupoDTO crear(@RequestBody GrupoDTO dto) {
        return grupoService.crearGrupo(dto);
    }

    @GetMapping
    public List<GrupoDTO> listar() {
        return grupoService.listarGrupos();
    }

    @GetMapping("/{id}")
    public GrupoDTO obtener(@PathVariable Integer id) {
        return grupoService.obtenerGrupoPorId(id);
    }
}