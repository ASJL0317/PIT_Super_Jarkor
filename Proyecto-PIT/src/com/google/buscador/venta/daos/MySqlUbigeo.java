package com.google.buscador.venta.daos;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.google.buscador.venta.bean.DistritoBean;
import com.google.buscador.venta.bean.UbigeoBean;

public class MySqlUbigeo implements UbigeoDAO{


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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<UbigeoBean> traeDepartamentos() throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<DistritoBean>();
		try {
			lista =session.selectList("dawi.SQL_traeDepartamentos");
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<UbigeoBean> traeProvincias(UbigeoBean ubigeoBean) throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<DistritoBean>();
		try {
			lista =session.selectList("dawi.SQL_traeProvincias",ubigeoBean);
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<UbigeoBean> traeDistritos(UbigeoBean ubigeoBean) throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<DistritoBean>();
		try {
			lista =session.selectList("dawi.SQL_traeDistritos",ubigeoBean);
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	
}
