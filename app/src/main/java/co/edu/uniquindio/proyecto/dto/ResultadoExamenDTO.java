package co.edu.uniquindio.proyecto.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultadoExamenDTO {

    private Integer id;
    private Integer estudianteId;
    private Integer examenId;
    private Double nota;
    private LocalDateTime fechaPresentacion;
}