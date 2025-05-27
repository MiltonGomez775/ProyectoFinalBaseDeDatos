package co.edu.uniquindio.proyecto.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Pregunta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta")
    private Integer id;

    private String enunciado;

    @Column(length = 1000)
    private String opciones; // Podrías usar JSON, array o string delimitado

    private String respuestaCorrecta;

    private String tipo; // ejemplo: 'seleccion multiple', 'falso/verdadero'

    private Boolean publica;

    @ManyToOne
    @JoinColumn(name = "banco_preguntas_id")
    private BancoDePreguntas bancoDePreguntas;
}