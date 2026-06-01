package com.tuempresa.Facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.NoFrame;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;


@Embeddable // Usamos @Embeddable para marcar esta clase como un tipo de valor que se puede incrustar en otras entidades
@Getter @Setter
public class Direccion {

    @Column(length = 30) // los miembros se anotan igual que las entidades
    private String viaPublica;

    @Column(length = 5)
    private int codigoPostal;

    @Column(length = 20)
    private String municipio;

    @Column(length = 30)
    private String provincia;

}
