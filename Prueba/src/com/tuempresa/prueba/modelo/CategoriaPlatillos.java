package com.tuempresa.prueba.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class CategoriaPlatillos extends Identificable{
	@Column
	String descripcion;
}
