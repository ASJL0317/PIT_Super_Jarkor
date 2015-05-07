package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.FiltroBean;
import com.google.buscador.venta.bean.ReporteBean;
import com.google.buscador.venta.bean.VendedorBean;

public interface VendedorService {

	public abstract int registraVendedor(VendedorBean bean) throws Exception;

	public abstract int eliminaVendedor(int id) throws Exception;

	public abstract VendedorBean buscaVendedor(int id) throws Exception;

	public abstract int actualizaVendedor(VendedorBean bean) throws Exception;

	public abstract List<VendedorBean> listaVendedor() throws Exception;
	
	public List<VendedorBean> vendedoresXEstado(String estado) throws Exception;
	
	
	
	public abstract List<VendedorBean> consultaVendedor(VendedorBean bean) throws Exception;
	
	public abstract List<ReporteBean> reportesVendedoresEnDistrito() throws Exception;
	
	public abstract List<ReporteBean> reportesVendedoresEnDistritoEstado() throws Exception ;
	
	
	public abstract List<VendedorBean>  consultaDinamica01(FiltroBean bean) throws Exception;
	public abstract List<VendedorBean>  consultaDinamica02(FiltroBean bean) throws Exception;

	
}
