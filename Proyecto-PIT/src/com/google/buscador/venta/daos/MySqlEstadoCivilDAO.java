package com.google.buscador.venta.daos;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.google.buscador.venta.bean.EstadoCivilBean;

public class MySqlEstadoCivilDAO implements EstadoCivilDAO{


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
	public List<EstadoCivilBean> listarTodos() throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<EstadoCivilBean>();
		try {
			lista =session.selectList("dawi.SQL_estadoCivilListarTodos");
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

		
	

}
