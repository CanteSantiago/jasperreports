package com.tuempresa.prueba.modelo;
 

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Pedido extends Identificable{
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
    @DescriptionsList
    Mesa mesa;
}
