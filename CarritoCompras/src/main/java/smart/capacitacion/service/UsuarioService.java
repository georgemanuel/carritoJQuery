package smart.capacitacion.service;

import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Usuario;

public interface UsuarioService {
	
	public boolean crearCuenta(Usuario usuario);
	public String borrarCuenta(String borrarCuentaUsuario);
	public Usuario login(Usuario usuario);
	public CarritoCompras obtenerCarritoComprasByUsuario(Usuario usuario);
	public Usuario crearUsuarioByUsuario(Usuario usuario);
}
