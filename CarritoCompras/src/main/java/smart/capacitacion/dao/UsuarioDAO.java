package smart.capacitacion.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Usuario;

public class UsuarioDAO extends DAOGeneral {
	Connection conexion = null;
	Statement sentencia = null;
	ResultSet resultado = null;

	public UsuarioDAO() {
		this.conexion = getConnection();
	}

	public String getNombreUsuarioByRFC(String rfcUsuario) {
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "select * from \"USUARIO\" where \"RFC\"='" + rfcUsuario + "'";
			System.out.println(consultaSQL);
			resultado = sentencia.executeQuery(consultaSQL);
			String nombreUsuario = "N/E";
			while (resultado.next()) {
				nombreUsuario = resultado.getString("NOMBRE_USUARIO");
				System.out.println("Resultado:" + nombreUsuario);
			}
			return nombreUsuario;
		} catch (Exception error) {
			error.printStackTrace();
		}
		return "ERROR";

	}

	public Usuario login(Usuario usuario) {
		// TODO Auto-generated method stub
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "select * from \"USUARIO\" where \"EMAIL\"='" + usuario.getEmailUsuario()
					+ "' AND \"PASSWORD\"='" + usuario.getPasswordUsuario() + "'";
			System.out.println(consultaSQL);
			resultado = sentencia.executeQuery(consultaSQL);
			while (resultado.next()) {			
				usuario.setIdUsuario(resultado.getInt("ID_USUARIO"));
				return usuario;
			}
		} catch (Exception error) {
			error.printStackTrace();
		}
		return null;
	}

	public CarritoCompras obtenerCarritoComprasByUsuario(Usuario usuario) {
		try {

			sentencia = conexion.createStatement();
			String consultaSQL = "SELECT \"ID_CARRITO\"  FROM \"USUARIO\" U INNER JOIN \"CARRITO_COMPRAS\" C ON (U.\"ID_USUARIO\" = C.\"ID_USUARIO\") WHERE U.\"ID_USUARIO\"='" + usuario.getIdUsuario() + "'";
			System.out.println(consultaSQL);
			resultado = sentencia.executeQuery(consultaSQL);
			while (resultado.next()) {
				CarritoCompras carritoCompras = new CarritoCompras();
				carritoCompras.setIdCarrito(resultado.getInt("ID_CARRITO"));
				return carritoCompras;
			}

		} catch (Exception error) {
			error.printStackTrace();
		}
		return null;
	}

	public Usuario crearUsuarioByUsuario(Usuario usuario) {
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "INSERT INTO public.\"USUARIO\"(\"ID_USUARIO\",\"NOMBRE_USUARIO\","
					+ "\"PATERNO\",\"MATERNO\",\"SEXO\",\"CALLE\",\"COLONIA\",\"NUMERO\","
					+ "\"DELEGACION\",\"TEL_CASA\",\"CELULAR\",\"RFC\",\"EMAIL\",\"PASSWORD\",\"FECHA_NACIMIENTO\")" + "VALUES ("
					+ "nextval('sec_usuario')" + "," + "'" + usuario.getNombreUsuario() + "'" + ","
					+ "'" +usuario.getApellidoPaternoUsuario()+ "'" + "," + "'" + usuario.getApellidoMeternoUsuario() + "'" +","
					+ "'" + usuario.getSexoDelUsuario() + "'" + "," + "'" + usuario.getCalleUsuario()+ "'" + "," + "'" + usuario.getColoniaUsuario()
					+ "'" + "," + "'" + usuario.getNumeroUsuario() + "'" + "," + "'" + usuario.getDelegacionUsuario() + "'" + ","
					+ usuario.getTelUsuario() + "," + usuario.getCelUsuario() + "," + "'" + usuario.getRfcUsuario() + "'" + ","
					+ "'" + usuario.getEmailUsuario() + "'" + "," + "'" + usuario.getPasswordUsuario() + "'" + "," +"'" + usuario.getFechaNacimiento() + "'" + ");";
			System.out.println(consultaSQL);
			sentencia.execute(consultaSQL);
			System.out.println(resultado);
			sentencia = conexion.createStatement();
			String consultaSQL2 = "SELECT \"ID_USUARIO\" FROM \"USUARIO\" WHERE \"EMAIL\"= " 
					+"'"+ usuario.getEmailUsuario() + "'";
			resultado = sentencia.executeQuery(consultaSQL2);
			System.out.println(consultaSQL2);
			while (resultado.next()) {
				usuario.setIdUsuario(resultado.getInt("ID_USUARIO"));			
			}
			return usuario;
		} catch (Exception error) {
			error.printStackTrace();
		}
		return null;
	}

}
