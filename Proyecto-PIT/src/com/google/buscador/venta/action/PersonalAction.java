package com.google.buscador.venta.action;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.google.buscador.venta.bean.PersonalBean;
import com.google.buscador.venta.service.PersonalServiceImpl;
import com.google.buscador.venta.util.Utilititarios;
import com.opensymphony.xwork2.ActionSupport;


@ParentPackage(value = "dawi")
public class PersonalAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private PersonalServiceImpl personalService = new PersonalServiceImpl();
	private PersonalBean personal;
	private List<PersonalBean> lstPersonal;
	private InputStream imagenPersonal, documentoPersonal;
	private int idCodigo;
	private String tipoArchivo, nombreArchivo;
	

//	@Action(value = "/registraPersonal",
//			results = { 
//						@Result( name = "success" ,location = "t_registroPersonal",type="tiles") ,
//						@Result( name = "error" ,location = "t_registroPersonal",type="tiles")
//						},
//			interceptorRefs={@InterceptorRef(params={"allowedTypes","image/png,image/gif,image/jpeg",
//											 		  "maximumSize","207152"}, 
//											 value="fileUpload")})
	@Action(value = "/registraPersonal",
	results = { 
				@Result( name = "success" ,location = "t_registroPersonal",type="tiles") ,
				@Result( name = "error" ,location = "t_registroPersonal",type="tiles")
				})
	public String registra() throws Exception {
		try {
			
			if(personal!= null){
				//Recibe File por el Struts y se convierte a byte[]
				File files= personal.getFilImagen();
				byte[] bytes =Utilititarios.getBytesFromFile(files);
				personal.setFilImagenBytes(bytes);
				
				
				File files1= personal.getFilCv();
				byte[] bytes1 =Utilititarios.getBytesFromFile(files1);
				personal.setFilCvBytes(bytes1);
				
				personalService.inserta(personal);
				return SUCCESS;
			}else{
				return ERROR;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	@Action(value = "/listaPersonal", results = { @Result(location = "t_listaPersonal", name = "success", type="tiles") })
	public String lista() throws Exception {
		try {
			lstPersonal = personalService.traeTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	/*
	   El param inputName:Es una parámetro establecido por el struts
	  					 onde coloca el objeto de retornoen tipo(InputStream)
	   El type = "stream" significa que devolverra un arreglo de bytes
	  
	 */
	@Action(value = "/verImagenPersonal", 
			results = { @Result(
							params={"inputName","imagenPersonal"}, 
							name = "success", type="stream") })
	public String imagenPersonal() throws Exception {
		try {
			
			PersonalBean personal = personalService.obtienePorPK(idCodigo);
			imagenPersonal = new ByteArrayInputStream(personal.getFilImagenBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	@SkipValidation
	@Action(value = "/verDocumentoPersonal", 
			results = { 
			@Result(params={
						"inputName","documentoPersonal",
						"contentType", "${tipoArchivo}",
						"contentDisposition", "filename=\"${nombreArchivo}\""}, 
					name = "success", type="stream") })
	public String documentoPersonal() throws Exception {
		try {
			
			PersonalBean aux = personalService.obtienePorPK(idCodigo);
			documentoPersonal = new ByteArrayInputStream(aux.getFilCvBytes());
			tipoArchivo = aux.getFilCvContentType();
			nombreArchivo = aux.getFilCvFileName();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public PersonalServiceImpl getPersonalService() {
		return personalService;
	}
	public void setPersonalService(PersonalServiceImpl personalService) {
		this.personalService = personalService;
	}
	public PersonalBean getPersonal() {
		return personal;
	}
	public void setPersonal(PersonalBean personal) {
		this.personal = personal;
	}
	public List<PersonalBean> getLstPersonal() {
		return lstPersonal;
	}
	public void setLstPersonal(List<PersonalBean> lstPersonal) {
		this.lstPersonal = lstPersonal;
	}
	public InputStream getImagenPersonal() {
		return imagenPersonal;
	}
	public void setImagenPersonal(InputStream imagenPersonal) {
		this.imagenPersonal = imagenPersonal;
	}
	public InputStream getDocumentoPersonal() {
		return documentoPersonal;
	}
	public void setDocumentoPersonal(InputStream documentoPersonal) {
		this.documentoPersonal = documentoPersonal;
	}
	public int getIdCodigo() {
		return idCodigo;
	}
	public void setIdCodigo(int idCodigo) {
		this.idCodigo = idCodigo;
	}
	public String getTipoArchivo() {
		return tipoArchivo;
	}
	public void setTipoArchivo(String tipoArchivo) {
		this.tipoArchivo = tipoArchivo;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	
}