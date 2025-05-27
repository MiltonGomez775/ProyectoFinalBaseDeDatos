package co.edu.uniquindio.proyecto.service.Impl;

import co.edu.uniquindio.proyecto.dto.ExamenDTO;
import co.edu.uniquindio.proyecto.mapper.ExamenMapper;
import co.edu.uniquindio.proyecto.model.Unidad;
import co.edu.uniquindio.proyecto.repository.ExamenRepository;
import co.edu.uniquindio.proyecto.repository.UnidadRepository;
import co.edu.uniquindio.proyecto.service.ExamenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamenServiceImpl implements ExamenService {

    private final ExamenRepository examenRepository;
    private final UnidadRepository unidadRepository;
    private final ExamenMapper examenMapper;

    @Override
    public ExamenDTO crearExamen(ExamenDTO examenDTO) {
        Unidad unidad = unidadRepository.findById(examenDTO.getUnidadId())
                .orElseThrow(() -> new RuntimeException("Unidad no encontrada"));
        var examen = examenMapper.toEntity(examenDTO, unidad);
        return examenMapper.toDTO(examenRepository.save(examen));
    }

    @Override
    public List<ExamenDTO> listarExamenes() {
        return examenMapper.toDTOList(examenRepository.findAll());
    }

    @Override
    public ExamenDTO obtenerExamenPorId(Integer id) {
        return examenMapper.toDTO(
                examenRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Examen no encontrado")));
    }
}