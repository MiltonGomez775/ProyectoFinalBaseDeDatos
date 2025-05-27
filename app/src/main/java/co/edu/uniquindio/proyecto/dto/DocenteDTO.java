package co.edu.uniquindio.proyecto.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocenteDTO {
    private Integer idDocente;
    private String nombre;
    private String email;
}