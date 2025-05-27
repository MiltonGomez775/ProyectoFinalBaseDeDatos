package co.edu.uniquindio.proyecto.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstudianteDTO {

    private Integer id;
    private String nombre;
    private String correo;
    private Integer grupoId;
}