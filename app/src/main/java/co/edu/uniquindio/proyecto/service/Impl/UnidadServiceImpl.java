package co.edu.uniquindio.proyecto.service.Impl;

import co.edu.uniquindio.proyecto.dto.UnidadDTO;
import co.edu.uniquindio.proyecto.mapper.UnidadMapper;
import co.edu.uniquindio.proyecto.repository.UnidadRepository;
import co.edu.uniquindio.proyecto.service.UnidadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UnidadServiceImpl implements UnidadService {

    private final UnidadRepository unidadRepository;
    private final UnidadMapper unidadMapper;

    @Override
    public UnidadDTO crearUnidad(UnidadDTO unidadDTO) {
        var unidad = unidadMapper.toEntity(unidadDTO);
        var guardada = unidadRepository.save(unidad);
        return unidadMapper.toDTO(guardada);
    }

    @Override
    public List<UnidadDTO> listarUnidades() {
        return unidadMapper.toDTOList(unidadRepository.findAll());
    }

    @Override
    public UnidadDTO obtenerUnidadPorId(Integer id) {
        var unidad = unidadRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Unidad no encontrada"));
        return unidadMapper.toDTO(unidad);
    }
}