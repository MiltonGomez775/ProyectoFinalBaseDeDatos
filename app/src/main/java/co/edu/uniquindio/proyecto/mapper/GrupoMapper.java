package co.edu.uniquindio.proyecto.mapper;

import co.edu.uniquindio.proyecto.dto.GrupoDTO;
import co.edu.uniquindio.proyecto.model.Grupo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GrupoMapper {
    GrupoDTO toDTO(Grupo grupo);

    Grupo toEntity(GrupoDTO grupoDTO);

    List<GrupoDTO> toDTOList(List<Grupo> grupos);
}