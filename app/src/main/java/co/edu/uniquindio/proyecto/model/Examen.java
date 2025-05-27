package co.edu.uniquindio.proyecto.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Examen")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_examen")
    private Integer id;

    private String titulo;

    @Column(length = 500)
    private String descripcion;

    private LocalDateTime fechaInicio;

    private LocalDateTime fechaFin;

    private Integer duracionMinutos;

    private Boolean activo;

    @ManyToOne
    @JoinColumn(name = "unidad_id")
    private Unidad unidad;
}