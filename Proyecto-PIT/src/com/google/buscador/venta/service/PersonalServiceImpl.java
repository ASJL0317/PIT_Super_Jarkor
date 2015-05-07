package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.PersonalBean;
import com.google.buscador.venta.daos.DAOFactory;
import com.google.buscador.venta.daos.PersonalDAO;

public class PersonalServiceImpl implements PersonalService {

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	PersonalDAO dao = factoria.getPersonalDAO();
	
	public int inserta(PersonalBean bean) throws Exception {
		return dao.inserta(bean);
	}
	
	public List<PersonalBean> traeTodos() throws Exception {
		return dao.traeTodos();
	}

	public PersonalBean obtienePorPK(int id) throws Exception {
		return dao.obtienePorPK(id);
	}


	

}
