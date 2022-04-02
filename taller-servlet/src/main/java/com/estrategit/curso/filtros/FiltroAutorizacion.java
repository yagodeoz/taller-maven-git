package com.estrategit.curso.filtros;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD
		}
					, urlPatterns = { "/paginas/privadas/*" })
public class FiltroAutorizacion implements Filter {

    public FiltroAutorizacion() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		String usuario = (String)req.getSession().getAttribute("usuarioLogin");
		
		if (req.getSession().isNew()) {
			RequestDispatcher rd = 
					req.getRequestDispatcher("/paginas/publicas/login.jsp");
			rd.forward(request, response);
		}
		
		if (usuario == null || !usuario.equals("ADMIN") ) {
			System.out.println("EL USUARIO NO ES CORRECTO");
			req.setAttribute("mensaje", 
					"El usuario no está autorizado para ingresar a ésta página");
			RequestDispatcher rd = req.getRequestDispatcher("/paginas/publicas/error.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("EL USUARIO PUEDE CONTINUAR");
			chain.doFilter(request, response);
		}		
	
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
