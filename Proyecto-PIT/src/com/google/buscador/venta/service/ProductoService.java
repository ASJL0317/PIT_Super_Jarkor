package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.ProductoBean;

public interface ProductoService {
	
	public List<ProductoBean> productoPorCategoria(String categoria) throws Exception;
	
}
