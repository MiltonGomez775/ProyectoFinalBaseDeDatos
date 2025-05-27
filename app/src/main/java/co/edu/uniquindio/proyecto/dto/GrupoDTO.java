package co.edu.uniquindio.proyecto.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GrupoDTO {
    private Integer id;
    private String nombre;
    private Integer anio;
    private String semestre;
}