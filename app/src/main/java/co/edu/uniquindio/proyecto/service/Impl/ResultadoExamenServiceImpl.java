package co.edu.uniquindio.proyecto.service.Impl;

import co.edu.uniquindio.proyecto.dto.ResultadoExamenDTO;
import co.edu.uniquindio.proyecto.mapper.ResultadoExamenMapper;
import co.edu.uniquindio.proyecto.model.Estudiante;
import co.edu.uniquindio.proyecto.model.Examen;
import co.edu.uniquindio.proyecto.repository.EstudianteRepository;
import co.edu.uniquindio.proyecto.repository.ExamenRepository;
import co.edu.uniquindio.proyecto.repository.ResultadoExamenRepository;
import co.edu.uniquindio.proyecto.service.ResultadoExamenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResultadoExamenServiceImpl implements ResultadoExamenService {

    private final ResultadoExamenRepository resultadoRepo;
    private final EstudianteRepository estudianteRepo;
    private final ExamenRepository examenRepo;
    private final ResultadoExamenMapper mapper;

    @Override
    public ResultadoExamenDTO registrarResultado(ResultadoExamenDTO dto) {
        Estudiante estudiante = estudianteRepo.findById(dto.getEstudianteId())
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
        Examen examen = examenRepo.findById(dto.getExamenId())
                .orElseThrow(() -> new RuntimeException("Examen no encontrado"));

        var resultado = mapper.toEntity(dto, estudiante, examen);
        return mapper.toDTO(resultadoRepo.save(resultado));
    }

    @Override
    public List<ResultadoExamenDTO> listarResultados() {
        return mapper.toDTOList(resultadoRepo.findAll());
    }

    @Override
    public ResultadoExamenDTO obtenerResultadoPorId(Integer id) {
        return resultadoRepo.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Resultado no encontrado"));
    }
}