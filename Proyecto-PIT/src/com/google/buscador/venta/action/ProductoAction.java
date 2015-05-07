package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.ProductoBean;
import com.google.buscador.venta.service.ProductoServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class ProductoAction extends ActionSupport {

	
	private ProductoBean producto;
	private List<ProductoBean> grdProducto;

	private ProductoServiceImpl service = new ProductoServiceImpl();
	
	// crear una sesion
	private Map<String, Object> session = ActionContext.getContext().getSession();
	
	
	// para paginacion
	private Integer rows = 0, page = 0, total = 0, records = 0;
	
	@Action(value = "/consultaProducto", results = {@Result(location = "t_consultaProductoGrid", name = "success",type="tiles") })
	public String consultaProducto(){
		System.out.println("En consulta producto");
		try {
			
		List<ProductoBean>  data =	
				service.productoPorCategoria(producto.getCategoria());
		session.put("keyProducto", data);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return SUCCESS;
	}
	
	@Action(value = "/listaProductoGrid", results = { @Result(name = "success", type = "json") })
	public String listaProducto(){
		System.out.println("En lista Poroducto grid");
		try {
			@SuppressWarnings("unchecked")
			List<ProductoBean> data = (ArrayList<ProductoBean>) session.get("keyProducto");

			records = data.size();

			int hasta = (rows * page);
			int desde = hasta - rows;
			if (hasta > records)
				hasta = records;

			grdProducto = data.subList(desde, hasta);

			total = (int) Math.ceil((double) records / (double) rows);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public ProductoBean getProducto() {
		return producto;
	}
	public void setProducto(ProductoBean producto) {
		this.producto = producto;
	}
	public List<ProductoBean> getGrdProducto() {
		return grdProducto;
	}
	public void setGrdProducto(List<ProductoBean> grdProducto) {
		this.grdProducto = grdProducto;
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
	
	
	
}
