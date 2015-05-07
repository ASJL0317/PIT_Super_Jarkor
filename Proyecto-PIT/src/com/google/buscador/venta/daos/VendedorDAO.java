package com.google.buscador.venta.daos;

import java.util.List;

import com.google.buscador.venta.bean.FiltroBean;
import com.google.buscador.venta.bean.ReporteBean;
import com.google.buscador.venta.bean.VendedorBean;


public interface VendedorDAO {
	
	public abstract int inserta(VendedorBean bean) throws Exception;
	public abstract int elimina(int id) throws Exception;
	public abstract int actualiza(VendedorBean bean) throws Exception;
	public abstract VendedorBean obtienePorPK(int id) throws Exception;
	public abstract List<VendedorBean> traeTodos() throws Exception;
	public List<VendedorBean> vendedoresXEstado(String estado) throws Exception;
	
	public abstract List<VendedorBean>  consultaVendedor(VendedorBean bean) throws Exception;
	public abstract List<ReporteBean>  reportesVendedoresEnDistrito() throws Exception;
	public abstract List<ReporteBean> reportesVendedoresEnDistritoEstado() throws Exception ;
	
	public abstract List<VendedorBean>  consultaDinamica01(FiltroBean bean) throws Exception;
	public abstract List<VendedorBean>  consultaDinamica02(FiltroBean bean) throws Exception;

	
}
