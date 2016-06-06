package smart.capacitacion.service;

import smart.capacitacion.dao.CarritoComprasDAO;
import smart.capacitacion.dao.ProductoDAO;
import smart.capacitacion.dao.UsuarioDAO;
import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;
import smart.capacitacion.modelo.Usuario;

public class CarritoComprasServiceImpl implements CarritoComprasService {
	
	CarritoComprasDAO carritoComprasDAO = new CarritoComprasDAO();
	ProductoDAO productoDAO = new ProductoDAO();
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	@Override
	public CarritoCompras crearCarritoByUsuario(Usuario usuario) {
		
		return carritoComprasDAO.crearCarritoByUsuario(usuario);
	}

	@Override
	public boolean eliminarProductoDelCarrito(CarritoCompras carritoCompras) {
		// TODO Auto-generated method stub
		return this.carritoComprasDAO.eliminarProductoDelCarrito(carritoCompras);
	}

	@Override
	public boolean agregarProductoAlCarrito(CarritoCompras carritoCompras) {
		
		return this.carritoComprasDAO.agregarProductoAlCarrito(carritoCompras);
	}


}
