package servlets;

import clasesServices.DepartmentsServices;
import clasesServices.EmployeesServices;
import dataBaseHR.Employees;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class RecuperarEmpleadosPorDepts
 */

public class RecuperarEmpleadosPorDepts extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private final static Logger log = LogManager.getRootLogger();
	
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		log.trace("doGet RecuperarEmpleadosPorDepts");
		
		List<Employees> listaEmpleados = null;
		PrintWriter out = null;
		resp.setContentType("text/html");
		out = resp.getWriter();
		String idDept = (String) req.getParameter("dept");
		EmployeesServices empService = new EmployeesServices();
		listaEmpleados = empService.obtenerEmplPorDept(idDept);
		out.println(listaEmpleados);
		req.setAttribute("listaEmpleados", listaEmpleados);
		req.getRequestDispatcher("listaEmpleadosPorDepartamento.jsp").forward(req, resp);		
	}

}