package co.edu.uniquindio.proyecto.service.Impl;

import co.edu.uniquindio.proyecto.dto.BancoDePreguntasDTO;
import co.edu.uniquindio.proyecto.mapper.BancoDePreguntasMapper;
import co.edu.uniquindio.proyecto.model.Docente;
import co.edu.uniquindio.proyecto.repository.BancoDePreguntasRepository;
import co.edu.uniquindio.proyecto.repository.DocenteRepository;
import co.edu.uniquindio.proyecto.service.BancoDePreguntasService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BancoDePreguntasServiceImpl implements BancoDePreguntasService {

    private final BancoDePreguntasRepository bancoRepo;
    private final DocenteRepository docenteRepo;
    private final BancoDePreguntasMapper mapper;

    @Override
    public BancoDePreguntasDTO crearBanco(BancoDePreguntasDTO bancoDTO) {
        Docente docente = docenteRepo.findById(bancoDTO.getDocenteId())
                .orElseThrow(() -> new RuntimeException("Docente no encontrado"));
        var banco = mapper.toEntity(bancoDTO, docente);
        return mapper.toDTO(bancoRepo.save(banco));
    }

    @Override
    public List<BancoDePreguntasDTO> listarBancos() {
        return mapper.toDTOList(bancoRepo.findAll());
    }

    @Override
    public BancoDePreguntasDTO obtenerBancoPorId(Integer id) {
        return mapper.toDTO(
                bancoRepo.findById(id)
                        .orElseThrow(() -> new RuntimeException("Banco de preguntas no encontrado")));
    }
}