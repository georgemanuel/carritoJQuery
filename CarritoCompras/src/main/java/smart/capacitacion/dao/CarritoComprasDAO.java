package smart.capacitacion.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;
import smart.capacitacion.modelo.Usuario;

public class CarritoComprasDAO extends DAOGeneral {
	Connection conexion = null;
	Statement sentencia = null;
	ResultSet resultado = null;
	
	public CarritoComprasDAO() {
		this.conexion = getConnection();
	}

	public CarritoCompras crearCarritoByUsuario(Usuario usuario) {
		try {

			sentencia = conexion.createStatement();
			String consultaSQL = "INSERT INTO public.\"CARRITO_COMPRAS\"(\"ID_CARRITO\", \"ID_USUARIO\")"
					+ "VALUES (nextval('sec_carrito_compras')" + "," + usuario.getIdUsuario() + ");";
			System.out.println(consultaSQL);
			sentencia.execute(consultaSQL);
			sentencia = conexion.createStatement();
			String consultaSQL2 = "SELECT U.\"ID_USUARIO\",C.\"ID_CARRITO\" FROM \"USUARIO\" U INNER JOIN \"CARRITO_COMPRAS\" C ON (U.\"ID_USUARIO\" = C.\"ID_USUARIO\") WHERE C.\"ID_USUARIO\" ='"
					+ usuario.getIdUsuario() + "'";
			resultado = sentencia.executeQuery(consultaSQL2);
			while (resultado.next()) {
				
				CarritoCompras carritoCompras = new CarritoCompras();
				carritoCompras.setIdCarrito(resultado.getInt("ID_CARRITO"));
				carritoCompras.setUsuario(usuario);

				
				return carritoCompras;
			}

		} catch (Exception error) {
			error.printStackTrace();
		}
		return null;

	}

	// agregar producto al carrito
	public boolean agregarProductoAlCarrito(CarritoCompras carritoCompras) {
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "INSERT INTO public.\"CARRITO_PRODUCTO\"(\"ID_CARRITO\", \"ID_PRODUCTO\")" + "VALUES ("
					+ carritoCompras.getIdCarrito() + ","
					+ carritoCompras.getProductosEnCarrito().get(0).getIdProducto() + ");";
			System.out.println(consultaSQL);
			sentencia.execute(consultaSQL);
			System.out.println(resultado);
			return true;
		} catch (Exception error) {
			error.printStackTrace();
		}
		return false;

	}

	public boolean eliminarProductoDelCarrito(CarritoCompras carritoCompras) {
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "DELETE FROM public.\"CARRITO_PRODUCTO\" WHERE \"ID_CARRITO\"="
					+ carritoCompras.getIdCarrito() + " AND \"ID_PRODUCTO\"="
					+ carritoCompras.getProductosEnCarrito().get(0).getIdProducto();
			System.out.println(consultaSQL);
			sentencia.execute(consultaSQL);
			System.out.println(resultado);
			return true;
		} catch (Exception e) {

		}
		return false;
	}
}
