package co.edu.uniquindio.proyecto.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BancoDePreguntasDTO {

    private Integer id;
    private String nombre;
    private Boolean publico;
    private Integer docenteId;
}