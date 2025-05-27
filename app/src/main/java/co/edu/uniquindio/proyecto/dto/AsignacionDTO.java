package co.edu.uniquindio.proyecto.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AsignacionDTO {

    private Integer id;
    private Integer docenteId;
    private Integer grupoId;
    private Integer cursoId;
    private Integer unidadId;
}