package com.google.buscador.venta.daos;

import java.util.List;

import com.google.buscador.venta.bean.ClienteBean;


public interface ClienteDAO {
	
		public List<ClienteBean> clienteXEstado(int estado) throws Exception;
	
}
