package com.google.buscador.venta.daos;

import java.util.List;

import com.google.buscador.venta.bean.EstadoCivilBean;


public interface EstadoCivilDAO {
	
		public List<EstadoCivilBean> listarTodos() throws Exception;
	
}
