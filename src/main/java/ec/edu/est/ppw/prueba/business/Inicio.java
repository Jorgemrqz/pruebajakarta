package ec.edu.est.ppw.prueba.business;

import java.util.List;

import ec.edu.est.ppw.prueba.dao.ClienteDAO;
import ec.edu.est.ppw.prueba.model.Cliente;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class Inicio {
	
	@Inject
	private ClienteDAO daoCliente;
	
	@PostConstruct
	public void init() {
		
		Cliente cliente = new Cliente();
		cliente.setCedula("1729635019");
		cliente.setNombre("Jorge Marquez");
		cliente.setConsumo("209.00$");
		cliente.setDeuda("209.00$");
		
		daoCliente.insert(cliente);
		
		List<Cliente> listado = daoCliente.getAll();
		for(Cliente cli: listado) {
			System.out.println(cli.getCedula() + " " + cli.getNombre() + " " + cli.getConsumo() + " " + cli.getDeuda());
		}
	}
}
