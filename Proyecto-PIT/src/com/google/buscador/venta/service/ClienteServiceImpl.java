package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.ClienteBean;
import com.google.buscador.venta.daos.ClienteDAO;
import com.google.buscador.venta.daos.DAOFactory;

public class ClienteServiceImpl implements ClienteService {

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	ClienteDAO dao = factoria.getClienteDAO();

	

	public List<ClienteBean> clienteXEstado(int estado) throws Exception {
		return dao.clienteXEstado(estado);
	}

}
