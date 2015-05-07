package com.google.buscador.venta.bean;

public class ClienteBean {

	private int idCliente;
	private String nombre, apellido;
	private UbigeoBean ubigeo;
	private EstadoCivilBean estado;
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public UbigeoBean getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(UbigeoBean ubigeo) {
		this.ubigeo = ubigeo;
	}
	public EstadoCivilBean getEstado() {
		return estado;
	}
	public void setEstado(EstadoCivilBean estado) {
		this.estado = estado;
	}

	
}
