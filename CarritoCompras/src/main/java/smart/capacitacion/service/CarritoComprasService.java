package smart.capacitacion.service;

import java.util.List;

import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Usuario;
import smart.capacitacion.modelo.Producto;


public interface CarritoComprasService {
	
	public CarritoCompras crearCarritoByUsuario(Usuario usuario);
		
	public boolean eliminarProductoDelCarrito(CarritoCompras carritoCompras);

	public Producto agregarProductoAlCarrito(CarritoCompras carritoCompras);
}