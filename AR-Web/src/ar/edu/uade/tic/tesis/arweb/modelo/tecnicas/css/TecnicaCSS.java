package ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.css;

import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.CategoriaTecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.Tecnica;

public abstract class TecnicaCSS extends Tecnica {
	
	public TecnicaCSS(String numero, String nombre, String descripcion, CategoriaTecnica categoriaTecnica) {
		super(numero, nombre, descripcion, categoriaTecnica);
	}
	
}