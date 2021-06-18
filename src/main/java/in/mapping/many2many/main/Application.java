package in.mapping.many2many.main;

import java.util.Arrays;

import in.mapping.many2many.dao.EmployeeDao;
import in.mapping.many2many.dao.ProjectDao;
import in.mapping.many2many.model.Employee;
import in.mapping.many2many.model.Project;

public class Application {

	public static void main(String[] args) {
		
		
		Project p1 = new Project("project1");
		Project p2 = new Project("project2");
		Project p3 = new Project("project3");
		
		Employee e1 = new Employee("Naina", Arrays.asList(p1,p2));
		Employee e2 = new Employee("Komal", Arrays.asList(p2,p3));
		Employee e3 = new Employee("Rahul", Arrays.asList(p1));
		
		ProjectDao projectDao = new ProjectDao();
		projectDao.insertProject(p1);
		projectDao.insertProject(p2);
		projectDao.insertProject(p3);
		
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.insertEmployee(e1);
		employeeDao.insertEmployee(e2);
		employeeDao.insertEmployee(e3);
	}

}
