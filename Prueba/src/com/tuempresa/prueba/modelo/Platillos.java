package com.tuempresa.prueba.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;


@Entity @Getter @Setter
public class Platillos extends Identificable{
	@Column
	String nombre;
	
	@Money
    BigDecimal precio;
	
	@Column (length = 50)
	String descripcion;
	
	@Files 
    @Column (length = 32)
    String fotos; 
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
    @DescriptionsList
    CategoriaPlatillos categoriaplatillo;
	
}
