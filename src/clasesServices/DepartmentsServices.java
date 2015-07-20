package clasesServices;

import clasesDAO.DepartmentsDAO;
import clasesDAO.EmployeesDAO;
import dataBaseHR.Departments;
import dataBaseHR.Employees;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DepartmentsServices {
	
	DepartmentsDAO dDAO = null;
	EmployeesDAO eDAO = null;
	private final static Logger log = LogManager.getRootLogger();
	
	public DepartmentsServices ()
	{			
		log.trace("se crea el objeto DepartmentsDAO");
		this.dDAO = new DepartmentsDAO();
		this.eDAO = new EmployeesDAO();
		
	}	

	public ArrayList<Departments> listarDepartamentos() {
		// TODO Auto-generated method stub
		log.trace("entra en el método listarDepartamentos");
		ArrayList<Departments> listaDepartamento = new ArrayList<Departments>();
		listaDepartamento.addAll(this.dDAO.obtenerDepartamentos());
		return listaDepartamento;
	}
	
	public ArrayList<Employees> listarEmpleados(String id) {
		// TODO Auto-generated method stub
		log.trace("entra en el método listarEmpleados");
		ArrayList<Employees> listaEmpleados = new ArrayList<Employees>();
		listaEmpleados.addAll(this.eDAO.leerEmpleados(id));
		return listaEmpleados;
	}

}
