package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.VendedorBean;
import com.google.buscador.venta.service.VendedorService;
import com.google.buscador.venta.service.VendedorServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class VendedorAction extends ActionSupport {

	private VendedorBean vendedor;
	private VendedorService vendedorService = new VendedorServiceImpl();
	private List<VendedorBean> grdVendedores;

	// para paginacion
	private Integer rows = 0, page = 0, total = 0, records = 0;

	// crear una sesion
	private Map<String, Object> session = ActionContext.getContext().getSession();
	
	
	@Action(value = "/consultaVendedor", results = {@Result(location = "t_consultaVendedorGrid", name = "success",type="tiles") })
	public String consultaVendedor() {
		System.out.println("En consulta vendedor");
		try {
			
		List<VendedorBean>  data =	
				vendedorService.vendedoresXEstado(vendedor.getStrEstado());
		
		session.put("keyVendedor", data);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SUCCESS;
	}

	// Este Actions es para la paginacion
	@Action(value = "/listaVendedorGrid", results = { @Result(name = "success", type = "json") })
	public String listaVendedorGrid() {
		System.out.println("En lista vendedor grid");
		try {
			@SuppressWarnings("unchecked")
			List<VendedorBean> data = (ArrayList<VendedorBean>) session.get("keyVendedor");

			records = data.size();

			int hasta = (rows * page);
			int desde = hasta - rows;
			if (hasta > records)
				hasta = records;

			grdVendedores = data.subList(desde, hasta);

			total = (int) Math.ceil((double) records / (double) rows);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	@Action(value = "/registro", results = { @Result(location = "/vendedorInsertado01.jsp", name = "success") })
	public String registraVendedor() {

		
		try {
			vendedorService.registraVendedor(vendedor);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(vendedor);
		
		return SUCCESS;
	}
	
	
	@Action(value = "/registro02", results = { @Result(location = "/vendedorInsertado02.jsp", name = "success") })
	public String registraVendedor02() {

		
		try {
			vendedorService.registraVendedor(vendedor);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(vendedor);
		
		return SUCCESS;
	}
	public VendedorBean getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorBean vendedor) {
		this.vendedor = vendedor;
	}
	
	public List<VendedorBean> getGrdVendedores() {
		return grdVendedores;
	}
	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	public void setGrdVendedores(List<VendedorBean> grdVendedores) {
		this.grdVendedores = grdVendedores;
	}
}
