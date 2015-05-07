package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
public class VendedorMantenimientoAction extends ActionSupport {


	private VendedorBean vendedor;
	private VendedorService vendedorService = new VendedorServiceImpl();
	private List<VendedorBean> grdVendedores;

	// para el mantenimiento
	private String codigo, nombre, apellido, edad, fecha, estado, distrito;

	// para paginacion
	private Integer rows = 0, page = 0, total = 0, records = 0;

	// crear una sesion
	private Map<String, Object> session = ActionContext.getContext().getSession();
	
	private String idSeleccion, mensaje;
	
	private static final Log log = LogFactory.getLog(VendedorMantenimientoAction.class);

	
	@Action(value = "/manteListaVendedorGrid", results = { @Result(name = "success", type = "json") })
	@SuppressWarnings("unchecked")
	public String listaVendedorGrid() {
		log.info("En lista vendedor Grid");
		try {
			
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
	
	@Action(value = "/actualizaVendedor", results = {@Result(location = "t_mantenimientoVendedorGrid", name = "success",type="tiles") })
	public String actualizaVendedor() throws Exception {
		log.info("En actualizaVendedor");
		
		vendedor = new VendedorBean();
		vendedor.setIntCodigo(Integer.parseInt(idSeleccion));
		vendedor.setStrNombre(nombre);
		vendedor.setStrApellido(apellido);
		vendedor.setStrDistrito(distrito);
		vendedor.setStrFecha(fecha);
		vendedor.setStrEstado(estado);
		vendedor.setIntEdad(Integer.parseInt(edad));
		
		vendedorService.actualizaVendedor(vendedor);
				
		return listaVendedor();
	}
	
	@Action(value = "/registraVendedor", results = {@Result(location = "t_mantenimientoVendedorGrid", name = "success",type="tiles") })
	public String registraVendedor() throws Exception {
		log.info("En registraVendedor");
		
		vendedor = new VendedorBean();
		vendedor.setStrNombre(nombre);
		vendedor.setStrApellido(apellido);
		vendedor.setStrDistrito(distrito);
		vendedor.setStrFecha(fecha);
		vendedor.setStrEstado(estado);
		vendedor.setIntEdad(Integer.parseInt(edad));
		
		vendedorService.registraVendedor(vendedor);
				
		return listaVendedor();
	}
	
	@Action(value = "/listaVendedor", results = {@Result(location = "t_mantenimientoVendedorGrid", name = "success",type="tiles") })
	public String listaVendedor() throws Exception {
		log.info("En listaVendedor");
		
		List<VendedorBean>  data =	vendedorService.listaVendedor();
		session.put("keyVendedor", data);
				
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	@Action(value = "/eliminaVendedor", results = {@Result(location = "t_mantenimientoVendedorGrid", name = "success",type="tiles") })
	public String eliminaVendedor() throws Exception {
		log.info("En eliminaVendedor");
		
		grdVendedores =(ArrayList<VendedorBean>)session.get("keyVendedor");
		
		if(grdVendedores== null ||  grdVendedores.size()==0){
			mensaje="Se debería haber realizado una selección";
			return SUCCESS;
		}
		
		if(idSeleccion == null||  idSeleccion.length()==0){
			mensaje="Se debería haber seleccionado un registro";
			return SUCCESS;
		}
		
		vendedorService.eliminaVendedor(Integer.parseInt(idSeleccion));
		idSeleccion = null;
		
		return listaVendedor();
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
	public String getIdSeleccion() {
		return idSeleccion;
	}
	public void setIdSeleccion(String idSeleccion) {
		this.idSeleccion = idSeleccion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getFecha() {
		return fecha;
	}

	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
}
