package co.edu.uniquindio.proyecto.service.Impl;

import co.edu.uniquindio.proyecto.dto.PreguntaDTO;
import co.edu.uniquindio.proyecto.mapper.PreguntaMapper;
import co.edu.uniquindio.proyecto.model.BancoDePreguntas;
import co.edu.uniquindio.proyecto.repository.BancoDePreguntasRepository;
import co.edu.uniquindio.proyecto.repository.PreguntaRepository;
import co.edu.uniquindio.proyecto.service.PreguntaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PreguntaServiceImpl implements PreguntaService {

    private final PreguntaRepository preguntaRepository;
    private final BancoDePreguntasRepository bancoDePreguntasRepository;
    private final PreguntaMapper preguntaMapper;

    @Override
    public PreguntaDTO crearPregunta(PreguntaDTO preguntaDTO) {
        BancoDePreguntas banco = bancoDePreguntasRepository.findById(preguntaDTO.getBancoDePreguntasId())
                .orElseThrow(() -> new RuntimeException("Banco de preguntas no encontrado"));
        var pregunta = preguntaMapper.toEntity(preguntaDTO, banco);
        return preguntaMapper.toDTO(preguntaRepository.save(pregunta));
    }

    @Override
    public List<PreguntaDTO> listarPreguntas() {
        return preguntaMapper.toDTOList(preguntaRepository.findAll());
    }

    @Override
    public PreguntaDTO obtenerPreguntaPorId(Integer id) {
        return preguntaMapper.toDTO(
                preguntaRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Pregunta no encontrada")));
    }
}