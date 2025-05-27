package co.edu.uniquindio.proyecto.controller;

import co.edu.uniquindio.proyecto.dto.DocenteDTO;
import co.edu.uniquindio.proyecto.service.DocenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/docentes")
@RequiredArgsConstructor
public class DocenteController {

    private final DocenteService docenteService;

    @GetMapping
    public ResponseEntity<List<DocenteDTO>> listarDocentes() {
        return ResponseEntity.ok(docenteService.listarDocentes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DocenteDTO> obtenerDocente(@PathVariable Integer id) {
        return ResponseEntity.ok(docenteService.obtenerDocentePorId(id));
    }

    @PostMapping
    public ResponseEntity<DocenteDTO> registrarDocente(@RequestBody DocenteDTO dto) {
        return ResponseEntity.ok(docenteService.registrarDocente(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DocenteDTO> actualizarDocente(@PathVariable Integer id, @RequestBody DocenteDTO dto) {
        return ResponseEntity.ok(docenteService.actualizarDocente(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDocente(@PathVariable Integer id) {
        docenteService.eliminarDocente(id);
        return ResponseEntity.noContent().build();
    }
}