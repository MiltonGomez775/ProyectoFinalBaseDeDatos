package co.edu.uniquindio.proyecto.service.Impl;

import co.edu.uniquindio.proyecto.dto.DocenteDTO;
import co.edu.uniquindio.proyecto.model.Docente;
import co.edu.uniquindio.proyecto.repository.DocenteRepository;
import co.edu.uniquindio.proyecto.service.DocenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DocenteServiceImpl implements DocenteService {

    private final DocenteRepository docenteRepository;

    @Override
    public List<DocenteDTO> listarDocentes() {
        return docenteRepository.findAll()
                .stream()
                .map(this::convertirADTO)
                .collect(Collectors.toList());
    }

    @Override
    public DocenteDTO obtenerDocentePorId(Integer id) {
        Docente docente = docenteRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Docente no encontrado"));
        return convertirADTO(docente);
    }

    @Override
    public DocenteDTO registrarDocente(DocenteDTO docenteDTO) {
        Docente docente = convertirAEntidad(docenteDTO);
        return convertirADTO(docenteRepository.save(docente));
    }

    @Override
    public DocenteDTO actualizarDocente(Integer id, DocenteDTO docenteDTO) {
        if (!docenteRepository.existsById(id)) {
            throw new NoSuchElementException("Docente no encontrado");
        }
        Docente docente = convertirAEntidad(docenteDTO);
        docente.setIdDocente(id);
        return convertirADTO(docenteRepository.save(docente));
    }

    @Override
    public void eliminarDocente(Integer id) {
        if (!docenteRepository.existsById(id)) {
            throw new NoSuchElementException("Docente no encontrado");
        }
        docenteRepository.deleteById(id);
    }

    private DocenteDTO convertirADTO(Docente docente) {
        return DocenteDTO.builder()
                .idDocente(docente.getIdDocente())
                .nombre(docente.getNombre())
                .email(docente.getEmail())
                .build();
    }

    private Docente convertirAEntidad(DocenteDTO dto) {
        return Docente.builder()
                .idDocente(dto.getIdDocente())
                .nombre(dto.getNombre())
                .email(dto.getEmail())
                .build();
    }
}