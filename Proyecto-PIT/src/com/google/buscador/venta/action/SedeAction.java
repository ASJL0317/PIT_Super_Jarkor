package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.SedeBean;
import com.google.buscador.venta.service.SedeService;
import com.google.buscador.venta.service.SedeServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class SedeAction extends ActionSupport {

	private SedeBean sede;
	private SedeService sedeService = new SedeServiceImpl();
	private List<SedeBean> grdSede;

	// para paginacion
	private Integer rows = 0, page = 0, total = 0, records = 0;

	// crear una sesion
	private Map<String, Object> session = ActionContext.getContext().getSession();
	
	
	@Action(value = "/consultaSede", results = {@Result(location = "t_consultaSedeGrid", name = "success",type="tiles") })
	public String consultaSede() {
		System.out.println("En consulta Sede");
		try {
			
		List<SedeBean>  data =	sedeService.sedeXDistrito(sede.getDistrito());
		session.put("keySede", data);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SUCCESS;
	}

	// Este Actions es para la paginacion
	@Action(value = "/listaSedeGrid", results = { @Result(name = "success", type = "json") })
	public String listaSedeGrid() {
		System.out.println("En lista Sede grid");
		try {
			@SuppressWarnings("unchecked")
			List<SedeBean> data = (ArrayList<SedeBean>) session.get("keySede");

			records = data.size();

			int hasta = (rows * page);
			int desde = hasta - rows;
			if (hasta > records)
				hasta = records;

			grdSede = data.subList(desde, hasta);

			total = (int) Math.ceil((double) records / (double) rows);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public SedeBean getSede() {
		return sede;
	}

	public void setSede(SedeBean sede) {
		this.sede = sede;
	}

	public List<SedeBean> getGrdSede() {
		return grdSede;
	}

	public void setGrdSede(List<SedeBean> grdSede) {
		this.grdSede = grdSede;
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

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	
	
	
}
