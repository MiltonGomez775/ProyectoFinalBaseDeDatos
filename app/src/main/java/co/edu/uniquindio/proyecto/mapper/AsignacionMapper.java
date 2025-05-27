package co.edu.uniquindio.proyecto.mapper;

import co.edu.uniquindio.proyecto.dto.AsignacionDTO;
import co.edu.uniquindio.proyecto.model.*;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AsignacionMapper {

    @Mapping(source = "docente.id", target = "docenteId")
    @Mapping(source = "grupo.id", target = "grupoId")
    @Mapping(source = "curso.id", target = "cursoId")
    @Mapping(source = "unidad.id", target = "unidadId")
    AsignacionDTO toDTO(AsignacionGrupoCursoUnidadDocente asignacion);

    @Mapping(target = "docente", source = "docente")
    @Mapping(target = "grupo", source = "grupo")
    @Mapping(target = "curso", source = "curso")
    @Mapping(target = "unidad", source = "unidad")
    AsignacionGrupoCursoUnidadDocente toEntity(
            AsignacionDTO dto,
            @Context Docente docente,
            @Context Grupo grupo,
            @Context Curso curso,
            @Context Unidad unidad);

    List<AsignacionDTO> toDTOList(List<AsignacionGrupoCursoUnidadDocente> asignaciones);
}