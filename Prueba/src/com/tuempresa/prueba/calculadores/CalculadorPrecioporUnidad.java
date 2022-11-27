package com.tuempresa.prueba.calculadores;

import static org.openxava.jpa.XPersistence.getManager;

import org.openxava.calculators.*;

import com.tuempresa.prueba.modelo.*;

import lombok.*;

public class CalculadorPrecioporUnidad  implements ICalculator{
	@Getter @Setter
	int numeroProducto;
	
	@Override
	public Object calculate() throws Exception {
		Bebidas bebidas = getManager() 
				.find (Bebidas.class, numeroProducto);
		return bebidas.getPrecio();
		 
	}
}
