package ar.edu.uade.tic.tesis.arweb.controlador;

import ar.edu.uade.tic.tesis.arweb.db.AnalisisDAO;
import ar.edu.uade.tic.tesis.arweb.util.utilidades.Contexto;
import ar.edu.uade.tic.tesis.arweb.util.utilidades.ContextoClaves;

public class GestorBaseDatos {

	public static ControlInformacion insertar(TipoValidacion tipoValidacion, String recurso, String principios, String nivelAccesibilidad, Integer umbral, Integer problemas, Integer advertencias, Integer noVerificados, Integer accesibilidad) {
		if (tipoValidacion == TipoValidacion.PAGINA_WEB || tipoValidacion == TipoValidacion.ARCHIVO) {
			try {
				new AnalisisDAO(recurso, principios, nivelAccesibilidad, umbral, problemas, advertencias, noVerificados, accesibilidad).insert();
			} catch (Exception e) {
				return new ControlInformacion(ControlInformacion.ERROR, "Error en la conexión con la base de datos o inserción del recurso.", "", e);
			}
		}
		return new ControlInformacion();
	}

	public static ControlInformacion seleccionar(TipoValidacion tipoValidacion, String recurso) {
		AnalisisDAO analisisDAO = null;
		if (tipoValidacion == TipoValidacion.PAGINA_WEB || tipoValidacion == TipoValidacion.ARCHIVO) {
			analisisDAO = new AnalisisDAO();
			analisisDAO.setUrl(recurso);
			try {
				analisisDAO.select();
			} catch (Exception e) {
				return new ControlInformacion(ControlInformacion.ERROR, "Error en la conexión con la base de datos o selección del recurso.", "", e);
			}
		}
		Contexto.set(ContextoClaves.ANALISIS_DAO, analisisDAO);
		return new ControlInformacion();
	}

}