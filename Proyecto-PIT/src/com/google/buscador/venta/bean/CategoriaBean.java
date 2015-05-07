package com.google.buscador.venta.bean;

public class CategoriaBean {
	private int idCategoria;
	private String descripcion;
	private String formato;
	
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFormato() {
		formato = idCategoria + "--->"+ descripcion;
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	

}
