package co.edu.uniquindio.proyecto.service.Impl;

import co.edu.uniquindio.proyecto.dto.AsignacionDTO;
import co.edu.uniquindio.proyecto.mapper.AsignacionMapper;
import co.edu.uniquindio.proyecto.model.*;
import co.edu.uniquindio.proyecto.repository.*;
import co.edu.uniquindio.proyecto.service.AsignacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AsignacionServiceImpl implements AsignacionService {

    private final AsignacionRepository asignacionRepo;
    private final DocenteRepository docenteRepo;
    private final GrupoRepository grupoRepo;
    private final CursoRepository cursoRepo;
    private final UnidadRepository unidadRepo;
    private final AsignacionMapper mapper;

    @Override
    public AsignacionDTO registrarAsignacion(AsignacionDTO dto) {
        Docente docente = docenteRepo.findById(dto.getDocenteId())
                .orElseThrow(() -> new RuntimeException("Docente no encontrado"));

        Grupo grupo = grupoRepo.findById(dto.getGrupoId())
                .orElseThrow(() -> new RuntimeException("Grupo no encontrado"));

        Curso curso = cursoRepo.findById(dto.getCursoId())
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));

        Unidad unidad = unidadRepo.findById(dto.getUnidadId())
                .orElseThrow(() -> new RuntimeException("Unidad no encontrada"));

        var asignacion = mapper.toEntity(dto, docente, grupo, curso, unidad);
        return mapper.toDTO(asignacionRepo.save(asignacion));
    }

    @Override
    public AsignacionDTO obtenerAsignacionPorId(Integer id) {
        return asignacionRepo.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Asignación no encontrada"));
    }

    @Override
    public List<AsignacionDTO> listarAsignaciones() {
        return mapper.toDTOList(asignacionRepo.findAll());
    }
}