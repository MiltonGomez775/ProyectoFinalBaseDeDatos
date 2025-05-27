package co.edu.uniquindio.proyecto.service.Impl;

import co.edu.uniquindio.proyecto.dto.EstudianteDTO;
import co.edu.uniquindio.proyecto.mapper.EstudianteMapper;
import co.edu.uniquindio.proyecto.model.Grupo;
import co.edu.uniquindio.proyecto.repository.EstudianteRepository;
import co.edu.uniquindio.proyecto.repository.GrupoRepository;
import co.edu.uniquindio.proyecto.service.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepo;
    private final GrupoRepository grupoRepo;
    private final EstudianteMapper mapper;

    @Override
    public EstudianteDTO registrarEstudiante(EstudianteDTO dto) {
        Grupo grupo = grupoRepo.findById(dto.getGrupoId())
                .orElseThrow(() -> new RuntimeException("Grupo no encontrado"));
        var estudiante = mapper.toEntity(dto, grupo);
        return mapper.toDTO(estudianteRepo.save(estudiante));
    }

    @Override
    public EstudianteDTO obtenerEstudiantePorId(Integer id) {
        return estudianteRepo.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
    }

    @Override
    public List<EstudianteDTO> listarEstudiantes() {
        return mapper.toDTOList(estudianteRepo.findAll());
    }
}