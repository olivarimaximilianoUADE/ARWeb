package ar.edu.uade.tic.tesis.arweb.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;


@Path("/ValidarAccesibilidadService")
public class ValidarAccesibilidadService {

	@GET
	@Path("/validarByUrl")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response<String> validarByUrl(@Context HttpHeaders httpheaders, String url) {
		Response<String> resp = new Response<String>();
		try {			
			String token = httpheaders.getRequestHeader("token").get(0);
			
			resp.setData(token);
			resp.setStatusCode(StatusCode.Success);
			resp.setMessage("OK");
		}
		catch(Exception ex) {
			resp.setStatusCode(StatusCode.InternalServerError);
			resp.setMessage(ex.getMessage());
		}
		
		return resp;
	}
	
	@GET
	@Path("/hola")
	public String hola() {
		return "Hola";
	}
}
