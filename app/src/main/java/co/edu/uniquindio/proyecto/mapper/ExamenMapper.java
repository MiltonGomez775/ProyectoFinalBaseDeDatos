package co.edu.uniquindio.proyecto.mapper;

import co.edu.uniquindio.proyecto.dto.ExamenDTO;
import co.edu.uniquindio.proyecto.model.Examen;
import co.edu.uniquindio.proyecto.model.Unidad;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExamenMapper {

    @Mapping(source = "unidad.id", target = "unidadId")
    ExamenDTO toDTO(Examen examen);

    @Mapping(source = "unidadId", target = "unidad")
    Examen toEntity(ExamenDTO examenDTO, @Context Unidad unidad);

    List<ExamenDTO> toDTOList(List<Examen> examenes);
}