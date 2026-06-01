package com.tuempresa.Facturacion.calculadores;

import javax.persistence.*;
import lombok.*;
import org.openxava.calculators.*;
import org.openxava.jpa.*;

// Un calculador tiene que implementar ICalculator
public class CalculadorSiguienteNumeroParaAnyo implements ICalculator {

    @Getter @Setter
    int anyo;  // Este valor se inyectará antes de calcular

    @Override
    public Object calculate() throws Exception { // Hace el cálculo
        Query query = XPersistence.getManager() // Una consulta JPA
                .createQuery("SELECT max(f.numero) from Factura f where f.anyo = :anyo");
        // La consulta devuelve el número de factura máximo del año indicado

        query.setParameter("anyo", anyo); // Ponemos el añño inyectado como parámetro e la consulta
        Integer ultimoNumero = (Integer) query.getSingleResult();
        return ultimoNumero == null ? 1 : ultimoNumero + 1;
        // Devuelve el último número de factura del año + 1 o 1 si no hay último número
    }

}
