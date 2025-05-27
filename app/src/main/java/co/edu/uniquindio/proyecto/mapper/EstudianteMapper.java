package co.edu.uniquindio.proyecto.mapper;

import co.edu.uniquindio.proyecto.dto.EstudianteDTO;
import co.edu.uniquindio.proyecto.model.Estudiante;
import co.edu.uniquindio.proyecto.model.Grupo;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstudianteMapper {

    @Mapping(source = "grupo.id", target = "grupoId")
    EstudianteDTO toDTO(Estudiante estudiante);

    @Mapping(target = "grupo", source = "grupo")
    Estudiante toEntity(EstudianteDTO dto, @Context Grupo grupo);

    List<EstudianteDTO> toDTOList(List<Estudiante> estudiantes);
}