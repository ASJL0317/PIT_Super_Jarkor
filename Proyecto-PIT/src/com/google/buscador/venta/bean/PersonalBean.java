package com.google.buscador.venta.bean;

import java.io.File;

//Para manejar archivos en STRUTS 2.0 se crea estos tres 
//campos obligatorios con la siguiente estructura
//private File XXXXX;
//private String XXXXXFileName;
//private String XXXXXContentType;

//Se crea este campo adicional porque el ibatis registra 
//en arreglo de bytes
//private byte[] XXXXXArreglo;

public class PersonalBean {
	private int intCodigo;
	private String strNombre;
	
	//para la imagen
	private File filImagen;
	private String filImagenFileName;
	private String filImagenContentType;
	private byte[] filImagenBytes;

	//para la imagen
	private File filCv;
	private String filCvFileName;
	private String filCvContentType;
	private byte[] filCvBytes;
	
	
	public File getFilCv() {
		return filCv;
	}
	public String getFilCvFileName() {
		return filCvFileName;
	}
	public String getFilCvContentType() {
		return filCvContentType;
	}
	public byte[] getFilCvBytes() {
		return filCvBytes;
	}
	public void setFilCv(File filCv) {
		this.filCv = filCv;
	}
	public void setFilCvFileName(String filCvFileName) {
		this.filCvFileName = filCvFileName;
	}
	public void setFilCvContentType(String filCvContentType) {
		this.filCvContentType = filCvContentType;
	}
	public void setFilCvBytes(byte[] filCvBytes) {
		this.filCvBytes = filCvBytes;
	}
	public int getIntCodigo() {
		return intCodigo;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public File getFilImagen() {
		return filImagen;
	}
	public String getFilImagenFileName() {
		return filImagenFileName;
	}
	public String getFilImagenContentType() {
		return filImagenContentType;
	}
	public byte[] getFilImagenBytes() {
		return filImagenBytes;
	}
	public void setIntCodigo(int intCodigo) {
		this.intCodigo = intCodigo;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public void setFilImagen(File filImagen) {
		this.filImagen = filImagen;
	}
	public void setFilImagenFileName(String filImagenFileName) {
		this.filImagenFileName = filImagenFileName;
	}
	public void setFilImagenContentType(String filImagenContentType) {
		this.filImagenContentType = filImagenContentType;
	}
	public void setFilImagenBytes(byte[] filImagenBytes) {
		this.filImagenBytes = filImagenBytes;
	}


	
}
