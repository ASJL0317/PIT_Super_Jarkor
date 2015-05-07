package com.google.buscador.venta.daos;


public abstract class DAOFactory {

	public static final int MYSQL = 1;
	public static final int ORACLE = 2;

	//objetos daos
	public abstract VendedorDAO getVendedorDAO();
	public abstract SedeDAO getSedeDAO();
	public abstract ProductoDAO getProductoDAO();
	public abstract UbigeoDAO getUbigeoDAO();
	public abstract EstadoCivilDAO getEstadoCivilDAO();
	public abstract ClienteDAO getClienteDAO();
	public abstract PersonalDAO getPersonalDAO();
	
	// Se aplica polimorfismo
	public static DAOFactory getFactorty(int bd) {
		switch (bd) {
			case MYSQL:
				return new MySqlDAOFActory();
			
		}
		return null;
	}

	

}
