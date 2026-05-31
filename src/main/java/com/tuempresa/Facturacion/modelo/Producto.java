package com.tuempresa.Facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity @Getter @Setter
public class Producto {
    @Id @Column(length=9)
    int numero;

    @Column(length=50) @Required
    String descripcion;

    @ManyToOne( // La referencia se almacena como una relación en la base de datos
        fetch = FetchType.LAZY, // La referencia se carga bajo demanda
        optional = true) // La referencia puede estar sin valor
    @DescriptionsList // Así la referencia se visualiza usando combo
    Categoria categoria; // Una referencia Java usando un combo

    @Money // La propiedad precio se usa para almacenar dinero
    BigDecimal precio; // BigDecimal se vuelve usar para dinero

    @Files // Una galería de fotos completa está disponible
    @Column(length = 32) // La cadena de 32 de longitud es para almacenar la clave de la galería
    String fotos;

    @TextArea // Esto es para un texto grande, se usará un área de texto o equivalente
    String observaciones;



}
