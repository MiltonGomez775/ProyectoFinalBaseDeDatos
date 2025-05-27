package co.edu.uniquindio.proyecto.mapper;

import co.edu.uniquindio.proyecto.dto.UnidadDTO;
import co.edu.uniquindio.proyecto.model.Unidad;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UnidadMapper {
    UnidadDTO toDTO(Unidad unidad);

    Unidad toEntity(UnidadDTO unidadDTO);

    List<UnidadDTO> toDTOList(List<Unidad> unidades);
}