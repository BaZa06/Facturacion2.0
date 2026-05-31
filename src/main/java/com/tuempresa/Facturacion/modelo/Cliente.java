package com.tuempresa.Facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //Esto marca la clase Cliente como una entidad
@Getter @Setter //Esto hace los campos a continuación públicamente accesibles
public class Cliente {
    @Id //La propiedad número es la clave. Las claves son obligatorias (required) por defecto
    @Column(length=6) //La longitud de la columna se usa a iel UI y a nivel DB
    int numero;

    @Column(length=50) //La longitud de columna se usa a nivel UI y a nivel DB
    @Required //Se mostrará un error de validación si la propiedad nobre se deja en blanco
    String nombre;

    @Embedded // Así para referenciar a una clcase inrcustable
    Direccion direccion; // Una referencia Java convencional
}
