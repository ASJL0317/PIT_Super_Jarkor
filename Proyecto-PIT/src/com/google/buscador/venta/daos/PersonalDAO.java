package com.google.buscador.venta.daos;

import java.util.List;

import com.google.buscador.venta.bean.PersonalBean;

public interface PersonalDAO {
	public abstract int inserta(PersonalBean  bean) throws Exception;
	public abstract List<PersonalBean> traeTodos() throws Exception;
	public abstract PersonalBean obtienePorPK(int id) throws Exception;

}
