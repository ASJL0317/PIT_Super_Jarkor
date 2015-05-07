package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.ProductoBean;
import com.google.buscador.venta.daos.DAOFactory;
import com.google.buscador.venta.daos.ProductoDAO;

public class ProductoServiceImpl implements ProductoService {

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	ProductoDAO dao = factoria.getProductoDAO();

	public List<ProductoBean> productoPorCategoria(String categoria) throws Exception {
		return dao.productosXCategoria(categoria);
	}

}
