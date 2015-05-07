package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.FiltroBean;
import com.google.buscador.venta.bean.ReporteBean;
import com.google.buscador.venta.bean.VendedorBean;
import com.google.buscador.venta.daos.DAOFactory;
import com.google.buscador.venta.daos.VendedorDAO;

public class VendedorServiceImpl implements VendedorService{

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	VendedorDAO dao = factoria.getVendedorDAO();

	public int registraVendedor(VendedorBean bean) throws Exception{
		return dao.inserta(bean);
	}
	public int eliminaVendedor(int id) throws Exception{
		return dao.elimina(id);
	}
	public VendedorBean buscaVendedor(int id) throws Exception{
		return dao.obtienePorPK(id);
	}
	public int actualizaVendedor(VendedorBean bean) throws Exception{
		return dao.actualiza(bean);
	}
	public List<VendedorBean> listaVendedor() throws Exception{
		return dao.traeTodos();
	}
	public List<VendedorBean> vendedoresXEstado(String estado) throws Exception {
		return dao.vendedoresXEstado(estado);
	}
	
	public List<VendedorBean> consultaVendedor(VendedorBean bean)	throws Exception {
		return dao.consultaVendedor(bean);
	}
	public List<ReporteBean> reportesVendedoresEnDistrito() throws Exception {
		return dao.reportesVendedoresEnDistrito();
	}
	public List<ReporteBean> reportesVendedoresEnDistritoEstado()throws Exception {
		return dao.reportesVendedoresEnDistritoEstado();
	}

	public List<VendedorBean> consultaDinamica01(FiltroBean bean)throws Exception {
		return dao.consultaDinamica01(bean);
	}
	public List<VendedorBean> consultaDinamica02(FiltroBean bean)	throws Exception {
		return dao.consultaDinamica02(bean);
	}
}
