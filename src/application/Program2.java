package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: deparment findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}

		System.out.println("=== TEST 2: deparment findById ===");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);

		/*
		System.out.println("=== TEST 3: deparment insert ===");
		dep = new Department(null, "Monitors");
		departmentDao.insert(dep);
		System.out.println(dep);
		*/
		
		/*
		System.out.println("=== TEST 4: deparment update ===");
		dep = new Department(11,"Pendrives");
		departmentDao.update(dep);
		System.out.println(dep);
		*/ 

		/*
		System.out.println("=== TEST 5: deparment deleteById ===");
		departmentDao.deleteById(12);
		*/
		
	}

}
