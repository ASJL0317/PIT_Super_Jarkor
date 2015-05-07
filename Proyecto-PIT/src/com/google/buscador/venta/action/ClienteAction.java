package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.ClienteBean;
import com.google.buscador.venta.service.ClienteService;
import com.google.buscador.venta.service.ClienteServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class ClienteAction extends ActionSupport {

	private String estado;
	private ClienteService clienteService = new ClienteServiceImpl();
	private List<ClienteBean> grdCliente;

	// para paginacion
	private Integer rows = 0, page = 0, total = 0, records = 0;

	// crear una sesion
	private Map<String, Object> session = ActionContext.getContext().getSession();
	
	
	@Action(value = "/consultaCliente", results = {@Result(location = "t_consultaClienteGrid", name = "success",type="tiles") })
	public String consultaCliente() {
		System.out.println("En consulta Cliente");
		try {

		List<ClienteBean>  data =	clienteService.clienteXEstado(Integer.parseInt(estado));
		session.put("keyCliente", data);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SUCCESS;
	}

	// Este Actions es para la paginacion
	@Action(value = "/listaClienteGrid", results = { @Result(name = "success", type = "json") })
	public String listaClienteGrid() {
		System.out.println("En lista Cliente grid");
		try {
			@SuppressWarnings("unchecked")
			List<ClienteBean> data = (ArrayList<ClienteBean>) session.get("keyCliente");

			records = data.size();

			int hasta = (rows * page);
			int desde = hasta - rows;
			if (hasta > records)
				hasta = records;

			grdCliente = data.subList(desde, hasta);

			total = (int) Math.ceil((double) records / (double) rows);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String getEstado() {
		return estado;
	}

	public List<ClienteBean> getGrdCliente() {
		return grdCliente;
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getPage() {
		return page;
	}

	public Integer getTotal() {
		return total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setGrdCliente(List<ClienteBean> grdCliente) {
		this.grdCliente = grdCliente;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	
	
	
	
}
