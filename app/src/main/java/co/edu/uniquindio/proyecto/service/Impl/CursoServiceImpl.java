package co.edu.uniquindio.proyecto.service.Impl;

import co.edu.uniquindio.proyecto.dto.CursoDTO;
import co.edu.uniquindio.proyecto.mapper.CursoMapper;
import co.edu.uniquindio.proyecto.repository.CursoRepository;
import co.edu.uniquindio.proyecto.service.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoServiceImpl implements CursoService {

    private final CursoRepository cursoRepository;
    private final CursoMapper cursoMapper;

    @Override
    public CursoDTO crearCurso(CursoDTO cursoDTO) {
        var entity = cursoMapper.toEntity(cursoDTO);
        var saved = cursoRepository.save(entity);
        return cursoMapper.toDTO(saved);
    }

    @Override
    public List<CursoDTO> listarCursos() {
        return cursoMapper.toDTOList(cursoRepository.findAll());
    }

    @Override
    public CursoDTO obtenerCursoPorId(Integer id) {
        var curso = cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
        return cursoMapper.toDTO(curso);
    }
}
