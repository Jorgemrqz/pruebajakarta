package ec.edu.est.ppw.prueba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_CLIENTE")
public class Cliente {
	
	@Id
	@Column(name = "cli_cedula")
	private String cedula;
	
	@Column(name = "cli_nombre")
	private String nombre;
	
	@Column(name = "cli_consumo")
	private String consumo;
	
	@Column(name = "cli_deuda")
	private String deuda;

	
	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getConsumo() {
		return consumo;
	}


	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}


	public String getDeuda() {
		return deuda;
	}


	public void setDeuda(String deuda) {
		this.deuda = deuda;
	}


	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", consumo=" + consumo + ", deuda=" + deuda + "]";
	}
	
	
}
