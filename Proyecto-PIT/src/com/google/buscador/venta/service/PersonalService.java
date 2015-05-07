package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.PersonalBean;

public interface PersonalService {
	
	public abstract int inserta(PersonalBean  bean) throws Exception;
	public abstract List<PersonalBean> traeTodos() throws Exception;
	public abstract PersonalBean obtienePorPK(int id) throws Exception;


	
}
