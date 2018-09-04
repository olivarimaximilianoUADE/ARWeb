package ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.script;

import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.CategoriaTecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.Tecnica;

public abstract class TecnicaSCR  extends Tecnica {
	
	public TecnicaSCR(String numero, String nombre, String descripcion, CategoriaTecnica categoriaTecnica) {
		super(numero, nombre, descripcion, categoriaTecnica);
	}
	
}