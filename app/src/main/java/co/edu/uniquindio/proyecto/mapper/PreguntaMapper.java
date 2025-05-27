package co.edu.uniquindio.proyecto.mapper;

import co.edu.uniquindio.proyecto.dto.PreguntaDTO;
import co.edu.uniquindio.proyecto.model.BancoDePreguntas;
import co.edu.uniquindio.proyecto.model.Pregunta;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PreguntaMapper {

    @Mapping(source = "bancoDePreguntas.id", target = "bancoDePreguntasId")
    PreguntaDTO toDTO(Pregunta pregunta);

    @Mapping(source = "bancoDePreguntasId", target = "bancoDePreguntas")
    Pregunta toEntity(PreguntaDTO preguntaDTO, @Context BancoDePreguntas bancoDePreguntas);

    List<PreguntaDTO> toDTOList(List<Pregunta> preguntas);
}
