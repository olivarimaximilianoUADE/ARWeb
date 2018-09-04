package ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.html;

import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.CategoriaTecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.Tecnica;

public abstract class TecnicaHTML extends Tecnica {
	
	public TecnicaHTML(String numero, String nombre, String descripcion, CategoriaTecnica categoriaTecnica) {
		super(numero, nombre, descripcion, categoriaTecnica);
	}
	
}
