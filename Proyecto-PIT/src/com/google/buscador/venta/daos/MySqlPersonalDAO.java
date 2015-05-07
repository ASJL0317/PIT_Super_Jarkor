package com.google.buscador.venta.daos;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.google.buscador.venta.bean.PersonalBean;

public class MySqlPersonalDAO implements PersonalDAO{

	SqlSessionFactory sqlMapper = null;
	{
		String archivo = "ConfiguracionIbatis.xml";
		try {
			Reader reader = Resources.getResourceAsReader(archivo);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int inserta(PersonalBean bean) throws Exception {
		SqlSession session = sqlMapper.openSession();
		int salida = -1;
		try {

			salida = session.insert("dawi.SQL_registraPersonal", bean);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return salida;
	}

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<PersonalBean> traeTodos() throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<PersonalBean>();
		try {
			lista =session.selectList("dawi.SQL_listaPersonal");
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}


	public PersonalBean obtienePorPK(int id) throws Exception {
		SqlSession session = sqlMapper.openSession();
		PersonalBean bean = null;
		try {
			bean= (PersonalBean)session.selectOne("dawi.SQL_buscaPersonal", id);
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
}
