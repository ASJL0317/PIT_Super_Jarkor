package com.google.buscador.venta.daos;

public class MySqlDAOFActory extends DAOFactory {

	@Override
	public UbigeoDAO getUbigeoDAO() {
		return new MySqlUbigeo();
	}

	@Override
	public VendedorDAO getVendedorDAO() {
		return new MySqlVendedorDAO();
	}

	@Override
	public SedeDAO getSedeDAO() {
		return new MySqlSedeDAO();
	}

	@Override
	public ProductoDAO getProductoDAO() {
		return new MySqlProductoDAO();
	}

	@Override
	public EstadoCivilDAO getEstadoCivilDAO() {
		return new MySqlEstadoCivilDAO();
	}

	@Override
	public ClienteDAO getClienteDAO() {
		return new MySqlClienteDAO();
	}

	@Override
	public PersonalDAO getPersonalDAO() {
		return new MySqlPersonalDAO();
	}

}
