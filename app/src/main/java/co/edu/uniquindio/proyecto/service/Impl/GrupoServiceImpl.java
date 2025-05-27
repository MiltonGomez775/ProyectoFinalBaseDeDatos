package co.edu.uniquindio.proyecto.service.Impl;

import co.edu.uniquindio.proyecto.dto.GrupoDTO;
import co.edu.uniquindio.proyecto.mapper.GrupoMapper;
import co.edu.uniquindio.proyecto.repository.GrupoRepository;
import co.edu.uniquindio.proyecto.service.GrupoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GrupoServiceImpl implements GrupoService {

    private final GrupoRepository grupoRepository;
    private final GrupoMapper grupoMapper;

    @Override
    public GrupoDTO crearGrupo(GrupoDTO grupoDTO) {
        var grupo = grupoMapper.toEntity(grupoDTO);
        var guardado = grupoRepository.save(grupo);
        return grupoMapper.toDTO(guardado);
    }

    @Override
    public List<GrupoDTO> listarGrupos() {
        return grupoMapper.toDTOList(grupoRepository.findAll());
    }

    @Override
    public GrupoDTO obtenerGrupoPorId(Integer id) {
        var grupo = grupoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Grupo no encontrado"));
        return grupoMapper.toDTO(grupo);
    }
}