package com.google.buscador.venta.daos;

import java.util.List;

import com.google.buscador.venta.bean.ProductoBean;


public interface ProductoDAO {
	
		public List<ProductoBean> productosXCategoria(String categoria) throws Exception;
	
}

