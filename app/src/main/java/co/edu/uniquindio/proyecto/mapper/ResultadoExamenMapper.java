package co.edu.uniquindio.proyecto.mapper;

import co.edu.uniquindio.proyecto.dto.ResultadoExamenDTO;
import co.edu.uniquindio.proyecto.model.Examen;
import co.edu.uniquindio.proyecto.model.Estudiante;
import co.edu.uniquindio.proyecto.model.ResultadoExamen;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ResultadoExamenMapper {

    @Mapping(source = "estudiante.id", target = "estudianteId")
    @Mapping(source = "examen.id", target = "examenId")
    ResultadoExamenDTO toDTO(ResultadoExamen resultado);

    @Mapping(target = "estudiante", source = "estudiante")
    @Mapping(target = "examen", source = "examen")
    ResultadoExamen toEntity(ResultadoExamenDTO dto, @Context Estudiante estudiante, @Context Examen examen);

    List<ResultadoExamenDTO> toDTOList(List<ResultadoExamen> resultados);
}