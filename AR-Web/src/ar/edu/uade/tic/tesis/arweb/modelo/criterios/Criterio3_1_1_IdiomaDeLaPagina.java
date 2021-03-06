package ar.edu.uade.tic.tesis.arweb.modelo.criterios;

import java.util.LinkedList;
import java.util.List;

import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.CategoriaTecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.Tecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.html.TecnicaH57;

public class Criterio3_1_1_IdiomaDeLaPagina extends Criterio {

	public Criterio3_1_1_IdiomaDeLaPagina() {
		super(
				"3.1.1", 
				"Idioma de la p�gina.",
				"El idioma por defecto de cada p�gina web puede ser programablemente determinado.",
				NivelAccesibilidad.A);
	}

	public List<Tecnica> getTecnicasAAgregar() {
		List<Tecnica> listaTecnicas = new LinkedList<Tecnica>();
		listaTecnicas.add(new TecnicaH57(CategoriaTecnica.SUFICIENTE));
		return listaTecnicas;
	}

}