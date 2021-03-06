package ar.edu.uade.tic.tesis.arweb.modelo.criterios;

import java.util.LinkedList;
import java.util.List;

import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.CategoriaTecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.Tecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.generales.TecnicaG5;

public class Criterio2_2_3_SinTiempo extends Criterio {

	public Criterio2_2_3_SinTiempo() {
		super(
				"2.2.3",
				"Sin Tiempo.",
				"El tiempo no es parte esencial del evento o actividad presentada por el contenido, exceptuando los multimedia sincronizados no interactivos y los eventos en tiempo real.",
				NivelAccesibilidad.AAA);
	}

	public List<Tecnica> getTecnicasAAgregar() {
		List<Tecnica> listaTecnicas = new LinkedList<Tecnica>();
		listaTecnicas.add(new TecnicaG5(CategoriaTecnica.SUFICIENTE));
		return listaTecnicas;
	}

}