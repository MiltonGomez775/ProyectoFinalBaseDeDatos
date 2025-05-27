package co.edu.uniquindio.proyecto.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CursoDTO {
    private Integer id;
    private String nombre;
    private String descripcion;
}