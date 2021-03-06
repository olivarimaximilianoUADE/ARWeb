package ar.edu.uade.tic.tesis.arweb.modelo.criterios;

import java.util.LinkedList;
import java.util.List;

import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.CategoriaTecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.Tecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.generales.TecnicaG127;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.generales.TecnicaG88;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.html.TecnicaH25;

public class Criterio2_4_2_PaginaTitulada extends Criterio {

	public Criterio2_4_2_PaginaTitulada() {
		super(
				"2.4.2", 
				"P�gina titulada.",
				"Las p�ginas web tienen t�tulos que describen su tema o prop�sito.",
				NivelAccesibilidad.A);
	}

	public List<Tecnica> getTecnicasAAgregar() {
		List<Tecnica> listaTecnicas = new LinkedList<Tecnica>();
		listaTecnicas.add(new TecnicaG88(CategoriaTecnica.SUFICIENTE));
		listaTecnicas.add(new TecnicaG127(CategoriaTecnica.RECOMENDABLE));
		listaTecnicas.add(new TecnicaH25(CategoriaTecnica.SUFICIENTE));
		return listaTecnicas;
	}

}