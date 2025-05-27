package co.edu.uniquindio.proyecto.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamenDTO {

    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Integer duracionMinutos;
    private Boolean activo;
    private Integer unidadId;
}