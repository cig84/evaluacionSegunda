package servlets;

import clasesServices.DepartmentsServices;
import dataBaseHR.Departments;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class ListaDepartamentos
 */

public class ListaDepartamentos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getRootLogger();   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		log.trace("Estamos en el doGet de la clase ListaDepartamentos");
		
		DepartmentsServices deptService = new DepartmentsServices();
		List<Departments> ld = deptService.listarDepartamentos();
		request.setAttribute("ld", ld);
		request.getRequestDispatcher("listaDepartamentos.jsp").forward(request, response);	
		
	}

}
