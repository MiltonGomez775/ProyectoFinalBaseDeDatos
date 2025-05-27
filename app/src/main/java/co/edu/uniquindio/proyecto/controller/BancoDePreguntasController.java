package co.edu.uniquindio.proyecto.controller;

import co.edu.uniquindio.proyecto.dto.BancoDePreguntasDTO;
import co.edu.uniquindio.proyecto.service.BancoDePreguntasService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bancos")
@RequiredArgsConstructor
public class BancoDePreguntasController {

    private final BancoDePreguntasService bancoService;

    @PostMapping
    public BancoDePreguntasDTO crear(@RequestBody BancoDePreguntasDTO dto) {
        return bancoService.crearBanco(dto);
    }

    @GetMapping
    public List<BancoDePreguntasDTO> listar() {
        return bancoService.listarBancos();
    }

    @GetMapping("/{id}")
    public BancoDePreguntasDTO obtener(@PathVariable Integer id) {
        return bancoService.obtenerBancoPorId(id);
    }
}