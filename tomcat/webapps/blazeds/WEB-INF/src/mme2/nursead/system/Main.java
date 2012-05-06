package mme2.nursead.system;

import mme2.nursead.service.EmployeeService;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EmployeeService es = new EmployeeService();
		es.printEmployees();

	}

}
