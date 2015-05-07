package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.SedeBean;
import com.google.buscador.venta.daos.DAOFactory;
import com.google.buscador.venta.daos.SedeDAO;

public class SedeServiceImpl implements SedeService {

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	SedeDAO dao = factoria.getSedeDAO();

	public List<SedeBean> sedeXDistrito(String distrito) throws Exception {
		return dao.sedeXDistritos(distrito);
	}

}
