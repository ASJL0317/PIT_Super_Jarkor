package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.EstadoCivilBean;
import com.google.buscador.venta.daos.DAOFactory;
import com.google.buscador.venta.daos.EstadoCivilDAO;

public class EstadoCivilServiceImpl implements EstadoCivilService {

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	EstadoCivilDAO dao = factoria.getEstadoCivilDAO();


	public List<EstadoCivilBean> listarTodos() throws Exception {
		return dao.listarTodos();
	}

}
