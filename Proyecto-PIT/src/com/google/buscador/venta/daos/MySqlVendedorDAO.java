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
import com.google.buscador.venta.bean.FiltroBean;
import com.google.buscador.venta.bean.ReporteBean;
import com.google.buscador.venta.bean.VendedorBean;

public class MySqlVendedorDAO implements VendedorDAO {


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
	public List<VendedorBean> consultaDinamica01(FiltroBean bean)
			throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<VendedorBean>();
		try {
			lista =session.selectList("dawi.SQL_consultaDinamica01",  bean);
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<VendedorBean> consultaDinamica02(FiltroBean bean)
			throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<VendedorBean>();
		try {
			lista =session.selectList("dawi.SQL_consultaDinamica02",  bean);
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	public int inserta(VendedorBean bean) throws Exception {
		SqlSession session = sqlMapper.openSession();
		int salida = -1;
		try {
			salida = session.insert("dawi.SQL_insertaVendedor",bean);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return salida;
	}

	public int elimina(int id) throws Exception {
		SqlSession session = sqlMapper.openSession();
		int salida = -1;
		try {
			salida = session.delete("dawi.SQL_eliminaVendedor", id);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return salida;
	}

	public int actualiza(VendedorBean bean) throws Exception {
		SqlSession session = sqlMapper.openSession();
		int salida = -1;
		try {

			salida = session.update("dawi.SQL_actualizaVendedor", bean);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return salida;
	}

	public VendedorBean obtienePorPK(int id) throws Exception {
		SqlSession session = sqlMapper.openSession();
		VendedorBean bean = null;
		try {
			bean= (VendedorBean)session.selectOne("dawi.SQL_buscaVendedor", id);
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<VendedorBean> traeTodos() throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<VendedorBean>();
		try {
			lista =session.selectList("dawi.SQL_traeTodosVendedor");
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<VendedorBean> vendedoresXEstado(String estado) throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<DistritoBean>();
		try {
			lista =session.selectList("dawi.SQL_vendedoresXEstado", estado);
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<VendedorBean> consultaVendedor(VendedorBean bean)
			throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<DistritoBean>();
		try {
			lista =session.selectList("dawi.SQL_reportesConsultaVendedor",  bean);
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<ReporteBean> reportesVendedoresEnDistrito() throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<ReporteBean>();
		try {
			lista =session.selectList("dawi.SQL_reportesVendedoresEnDistrito");
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<ReporteBean> reportesVendedoresEnDistritoEstado()
			throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<ReporteBean>();
		try {
			lista =session.selectList("dawi.SQL_reportesVendedoresEnDistritoEstado");
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}


}
