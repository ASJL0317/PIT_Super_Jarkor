package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.ClienteBean;

public interface ClienteService {
	
	public List<ClienteBean> clienteXEstado(int estado) throws Exception;
	
}
