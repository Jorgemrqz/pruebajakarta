package ec.edu.est.ppw.prueba.views;

import ec.edu.est.ppw.prueba.business.GestionClientes;
import ec.edu.est.ppw.prueba.model.Cliente;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("clientes")
@RequestScoped
public class VistaClientes {

	@Inject
	private GestionClientes gClientes;
	
	private Cliente cliente = new Cliente();
	private String cedula;
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public String getCedula() {
		return cedula;
	}
	
	public String buscar() {
		try {
			cliente = gClientes.getCliente(cedula);
			return "datosCliente?faces-redirect=true";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
}

