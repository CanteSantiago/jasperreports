package com.tuempresa.prueba.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.tuempresa.prueba.calculadores.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Detalles {
int cantidad;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	Bebidas bebidas;
	
	
	@Money
	@Depends("precioPorUnidad,cantidad")
	public BigDecimal getImporte() {
		if (precioPorUnidad==null) return BigDecimal.ZERO;
		return new BigDecimal(cantidad).multiply(precioPorUnidad);
	}
	 
	@DefaultValueCalculator(value = CalculadorPrecioporUnidad.class, 
			properties = @PropertyValue(name = "numeroProducto", from = "producto.numero")
	)
	
	@Money
	BigDecimal precioPorUnidad;
}
