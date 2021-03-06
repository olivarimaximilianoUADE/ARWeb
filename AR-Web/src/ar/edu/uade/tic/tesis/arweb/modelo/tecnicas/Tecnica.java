package ar.edu.uade.tic.tesis.arweb.modelo.tecnicas;

import ar.edu.uade.tic.tesis.arweb.modelo.base.Estructura;
import ar.edu.uade.tic.tesis.arweb.modelo.evaluacion.ResultadoEvaluacionTecnica;
import ar.edu.uade.tic.tesis.arweb.util.parser.Parseador;
import ar.edu.uade.tic.tesis.arweb.util.utilidades.Constantes;

public abstract class Tecnica extends Estructura {

	private CategoriaTecnica categoriaTecnica;
	private Parseador parseador;
	private String url;
	private static final String URL_TECNICA = Constantes.URL_TECNICAS_WCAG20;

	public Tecnica(String numero, String nombre, String descripcion, CategoriaTecnica categoriaTecnica) {
		super(numero, nombre, descripcion);
		this.setCategoriaTecnica(categoriaTecnica);
		this.setUrl(URL_TECNICA + this.getNumero());
	}

	public abstract ResultadoEvaluacionTecnica validarAccesibilidadPorTecnica(Parseador parseador);

	public Boolean isCategoriaTecnicaSuficiente() {
		return this.getCategoriaTecnica().getRepresentacionNumerica() == CategoriaTecnica.SUFICIENTE.getRepresentacionNumerica();
	}

	public Boolean isCategoriaTecnicaRecomendable() {
		return this.getCategoriaTecnica().getRepresentacionNumerica() == CategoriaTecnica.RECOMENDABLE.getRepresentacionNumerica();
	}

	public CategoriaTecnica getCategoriaTecnica() {
		return this.categoriaTecnica;
	}

	public void setCategoriaTecnica(CategoriaTecnica categoriaTecnica) {
		this.categoriaTecnica = categoriaTecnica;
	}

	public Parseador getParseador() {
		return this.parseador;
	}

	public void setParseador(Parseador parseador) {
		this.parseador = parseador;
	}

	public String getUrl() {
		return this.url;
	}

	private void setUrl(String url) {
		this.url = url;
	}

	public String toString() {
		return this.getCategoriaTecnica().getRepresentacionSimbolica() + ": " + this.getNumero();
	}

}