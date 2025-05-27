package co.edu.uniquindio.proyecto.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "BancoDePreguntas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BancoDePreguntas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_banco")
    private Integer id;

    private String nombre;

    private Boolean publico;

    @ManyToOne
    @JoinColumn(name = "docente_id")
    private Docente docente; // El docente que creó el banco
}