package ec.edu.est.ppw.prueba.services;

import ec.edu.est.ppw.prueba.business.GestionClientes;
import ec.edu.est.ppw.prueba.model.Cliente;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/clientes")
public class ClienteService {
	
	@Inject
	private GestionClientes gClientes;
	
	@GET
	@Path("/{cedula}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("cedula") String cedula) {
		try {
			Cliente cliente = gClientes.getCliente(cedula);
			if (cliente != null) {
				return Response.ok(cliente).build();
			} else {
				return Response.status(Response.Status.NOT_FOUND).entity("Cliente no encontrado").build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error al obtener el cliente").build();
		}
	}
}
