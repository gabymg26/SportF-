package com.sportgear.sportgear.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "devoluciones")
public class Devoluciones {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate fechaDevolucion;

    private String nombreUsuario;

    private Long codigoUsuario;

    private String estadoDevolucion;

    @OneToOne
    @JoinColumn(name = "idInventario")
    private Inventario inventario;

    @Override
    public String toString() {
        return "Devoluciones{" +
                "id=" + id +
                ", fechaDevolucion=" + fechaDevolucion +
                ", estadoDevolucion='" + estadoDevolucion + '\'' +
                ", inventario=" + inventario +
                '}';
    }
}
