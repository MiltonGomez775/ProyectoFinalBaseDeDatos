package co.edu.uniquindio.proyecto.mapper;

import co.edu.uniquindio.proyecto.dto.BancoDePreguntasDTO;
import co.edu.uniquindio.proyecto.model.BancoDePreguntas;
import co.edu.uniquindio.proyecto.model.Docente;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BancoDePreguntasMapper {

    @Mapping(source = "docente.id", target = "docenteId")
    BancoDePreguntasDTO toDTO(BancoDePreguntas banco);

    @Mapping(source = "docenteId", target = "docente")
    BancoDePreguntas toEntity(BancoDePreguntasDTO dto, @Context Docente docente);

    List<BancoDePreguntasDTO> toDTOList(List<BancoDePreguntas> bancos);
}