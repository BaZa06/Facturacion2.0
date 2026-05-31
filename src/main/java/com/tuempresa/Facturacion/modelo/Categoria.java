package com.tuempresa.Facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Categoria {
    @Id
    @Hidden //La propiedad no se uestra al usuario. Es un identificador interno
    @GeneratedValue(generator="system-uuid") //Identifiador Uniersal Único
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    String oid;

    @Column(length=50)
    String descripcion;
}
