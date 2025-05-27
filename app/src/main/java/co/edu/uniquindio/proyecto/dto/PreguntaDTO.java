package co.edu.uniquindio.proyecto.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PreguntaDTO {

    private Integer id;
    private String enunciado;
    private String opciones;
    private String respuestaCorrecta;
    private String tipo;
    private Boolean publica;
    private Integer bancoDePreguntasId;
}