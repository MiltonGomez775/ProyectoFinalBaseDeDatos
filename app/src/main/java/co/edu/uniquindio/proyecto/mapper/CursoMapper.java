package co.edu.uniquindio.proyecto.mapper;

import co.edu.uniquindio.proyecto.dto.CursoDTO;
import co.edu.uniquindio.proyecto.model.Curso;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CursoMapper {
    CursoDTO toDTO(Curso curso);

    Curso toEntity(CursoDTO cursoDTO);

    List<CursoDTO> toDTOList(List<Curso> cursos);
}