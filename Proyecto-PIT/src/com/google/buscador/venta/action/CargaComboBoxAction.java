package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.CategoriaBean;
import com.google.buscador.venta.bean.DistritoBean;
import com.google.buscador.venta.bean.EstadoCivilBean;
import com.google.buscador.venta.bean.VendedorBean;
import com.google.buscador.venta.service.EstadoCivilService;
import com.google.buscador.venta.service.EstadoCivilServiceImpl;
import com.google.buscador.venta.service.VendedorService;
import com.google.buscador.venta.service.VendedorServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value = "dawi")
public class CargaComboBoxAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private List<DistritoBean> lstDistrito = new ArrayList<DistritoBean>();
	private List<EstadoCivilBean> lstEstadoCivil = new ArrayList<EstadoCivilBean>();
	private List<CategoriaBean> lstCategoria = new ArrayList<CategoriaBean>() ;
	
	private List<VendedorBean> lstVendedor = new ArrayList<VendedorBean>() ;


	private VendedorService service = new VendedorServiceImpl();
	private EstadoCivilService service2 = new EstadoCivilServiceImpl();
	
	@Action(value = "/cargaVendedor", results = { @Result(name = "success", type="json") })
	public String cargaVendedor() {
		System.out.println("Carga combo cargaVendedor");
		try {
			lstVendedor = service.listaVendedor();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public List<CategoriaBean> getLstCategoria() {
		return lstCategoria;
	}

	public void setLstCategoria(List<CategoriaBean> lstCategoria) {
		this.lstCategoria = lstCategoria;
	}

	@Action(value = "/cargaCategoria", results = { @Result(name = "success", type="json") })
	public String cargaCategoria() {
		System.out.println("Carga combo categoria");
		
		CategoriaBean b1 = new CategoriaBean();
		b1.setIdCategoria(1);
		b1.setDescripcion("Informatica");
		
		CategoriaBean b2 = new CategoriaBean();
		b2.setIdCategoria(2);
		b2.setDescripcion("Oficina");
		
		lstCategoria.add(b1);
		lstCategoria.add(b2);
		
		return SUCCESS;
	}
	
	
	@Action(value = "/cargaDistrito", results = { @Result(name = "success", type="json") })
	public String cargaDistrito() {

		lstDistrito.add(new DistritoBean("1","Lince"));
		lstDistrito.add(new DistritoBean("2","Miraflores"));
		lstDistrito.add(new DistritoBean("3","Los olivos"));
		lstDistrito.add(new DistritoBean("4","San Isidro"));
		return SUCCESS;
	}
	
	@Action(value = "/cargaEstadoCivil", results = { @Result(name = "success", type="json") })
	public String cargaEstadoCivil() {

		lstEstadoCivil.add(new EstadoCivilBean("1","Soltero"));
		lstEstadoCivil.add(new EstadoCivilBean("2","Casado"));
		lstEstadoCivil.add(new EstadoCivilBean("3","Viudo"));
		lstEstadoCivil.add(new EstadoCivilBean("4","Divorciado"));
		
		return SUCCESS;
	}
	
	@Action(value = "/cargaDinamicoEstadoCivil", results = { @Result(name = "success", type="json") })
	public String cargaDinamicoEstadoCivil() {
		System.out.println("Carga combo cargaDinamicoEstadoCivil");
		try {
			lstEstadoCivil = service2.listarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public List<DistritoBean> getLstDistrito() {
		return lstDistrito;
	}
	public void setLstDistrito(List<DistritoBean> lstDistrito) {
		this.lstDistrito = lstDistrito;
	}
	public List<EstadoCivilBean> getLstEstadoCivil() {
		return lstEstadoCivil;
	}
	public void setLstEstadoCivil(List<EstadoCivilBean> lstEstadoCivil) {
		this.lstEstadoCivil = lstEstadoCivil;
	}
	public List<VendedorBean> getLstVendedor() {
		return lstVendedor;
	}
	public void setLstVendedor(List<VendedorBean> lstVendedor) {
		this.lstVendedor = lstVendedor;
	}
}
