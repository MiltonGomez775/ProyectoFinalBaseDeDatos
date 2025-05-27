package co.edu.uniquindio.proyecto.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Unidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Unidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unidad")
    private Integer id;

    private String nombre;

    @Column(length = 500)
    private String descripcion;
}