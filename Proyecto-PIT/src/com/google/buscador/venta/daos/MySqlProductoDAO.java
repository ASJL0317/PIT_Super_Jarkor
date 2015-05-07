package com.google.buscador.venta.daos;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.google.buscador.venta.bean.ProductoBean;

public class MySqlProductoDAO implements ProductoDAO{


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
	public List<ProductoBean> productosXCategoria(String categoria) throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<ProductoBean>();
		try {
			lista =session.selectList("dawi.SQL_productosXCategoria", categoria);
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

		
	

}
