package DTO;

import java.time.LocalDate;

import controladores.Inicio;

public class Elemento {

	
	int idElemento;
	String codigoElemento = "aaaaaaaaa"; 
	String nombreelemento = "aaaaaaaaa";
	String descripcion = "aaaaaaaaa";
	int cantidad = 0 ;
	LocalDate fechaAlta = LocalDate.of(9999, 12, 31);
	LocalDate fechaBaja =  LocalDate.of(9999, 12, 31);
	//Constructor encragado de añadir objetos a la lista
	public Elemento( String codigoElemento, String nombreelemento, String descripcion, int cantidad,
			LocalDate fechaAlta) {
		super();
		this.idElemento = Inicio.idAuxiliar;
		Inicio.idAuxiliar = idElemento+1;
		this.codigoElemento = codigoElemento;
		this.nombreelemento = nombreelemento;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.fechaAlta = fechaAlta;
		
	}
	
	
	@Override
	public String toString() {
		return "Elemento [idElemento=" + idElemento + ", codigoElemento=" + codigoElemento + ", nombreelemento="
				+ nombreelemento + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", fechaAlta="
				+ fechaAlta + ", fecaBaja=" + fechaBaja + "]";
	}
	//Getter y setter encargado de dar y mostrar valores

	public Elemento() {
		super();
	}


	public int getIdElemento() {
		return idElemento;
	}




	public String getCodigoElemento() {
		return codigoElemento;
	}


	public void setCodigoElemento(String codigoElemento) {
		this.codigoElemento = codigoElemento;
	}


	public String getNombreelemento() {
		return nombreelemento;
	}


	public void setNombreelemento(String nombreelemento) {
		this.nombreelemento = nombreelemento;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public LocalDate getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public LocalDate getFecaBaja() {
		return fechaBaja;
	}


	public void setFecaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
}
