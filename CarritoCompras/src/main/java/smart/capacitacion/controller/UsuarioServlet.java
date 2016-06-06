package smart.capacitacion.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import smart.capacitacion.dao.CarritoComprasDAO;
import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Usuario;
import smart.capacitacion.service.CarritoComprasService;
import smart.capacitacion.service.CarritoComprasServiceImpl;
import smart.capacitacion.service.UsuarioService;
import smart.capacitacion.service.UsuarioServiceImpl;

/**
 * Servlet implementation class UsuarioServlet
 */
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioService usuarioService = new UsuarioServiceImpl();

	/**
	 * Default constructor.
	 */
	public UsuarioServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opcion = request.getParameter("opcion");
		if (opcion.equals("1")) {
			Usuario usuario = new Usuario();
			usuario.setEmailUsuario(request.getParameter("usuario"));
			usuario.setPasswordUsuario(request.getParameter("password"));
			usuario = this.usuarioService.login(usuario);
			if (usuario != null){
				CarritoCompras carritoCompras = usuarioService.obtenerCarritoComprasByUsuario(usuario);
				request.getSession().setAttribute("carritoCompras", carritoCompras);
				System.out.println("Ya existe carrito");
				
				response.sendRedirect("views/catalogoProductosGeneral.jsp");
				
			}	
			else{
				request.getSession().setAttribute("error", "DATOS NO VALIDOS");
				response.sendRedirect("views/login.jsp");
				System.out.println("Usuario no existe y/o Carrito vacio");
			}	
		}
		if (opcion.equals("2")) {
			response.getWriter().append("Served at hola: ").append(request.getContextPath());
			Usuario usuario = new Usuario();
			usuario.setApellidoMeternoUsuario(request.getParameter("apellidoMaterno"));
			usuario.setApellidoPaternoUsuario(request.getParameter("apellidoPaterno"));
			usuario.setCalleUsuario(request.getParameter("calleUsuario"));
			usuario.setColoniaUsuario(request.getParameter("coloniaUsuario"));
			usuario.setDelegacionUsuario(request.getParameter("delegacionUsuario"));
			usuario.setEmailUsuario(request.getParameter("emailUsuario"));
			usuario.setNombreUsuario(request.getParameter("nombreUsuario"));
			usuario.setNumeroUsuario(request.getParameter("numerousuario"));
			usuario.setPasswordUsuario(request.getParameter("passwordUsuario"));
			usuario.setRfcUsuario(request.getParameter("rfcUsuario"));
			usuario.setSexoDelUsuario(request.getParameter("sexoUsuario"));
			usuario.setCelUsuario(Integer.parseInt(request.getParameter("cellUsuario")));	
			usuario.setTelUsuario(Integer.parseInt(request.getParameter("telUsuario")));
			usuario.setFechaNacimiento(request.getParameter("fechaNacimiento"));
			usuario = usuarioService.crearUsuarioByUsuario(usuario);
			if (usuario != null) {
				
				CarritoComprasService carritoComprasService = new CarritoComprasServiceImpl();
				CarritoCompras carritoCompras = carritoComprasService.crearCarritoByUsuario(usuario);
				request.getSession().setAttribute("carritoCompras", carritoCompras);
				response.sendRedirect("views/login.jsp");
					
			// guardar en la sesión
				// redireccionar a la pagina home
			} else {
				
				request.getSession().setAttribute("error", "VERIFICA TUS DATOS");
			
			}
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("estoy en post");
		doGet(request, response);
	}

}
