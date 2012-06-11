package mme2.nursead.system;

import mme2.nursead.model.EmployeeVO;
import mme2.nursead.service.EmployeeService;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EmployeeService es = new EmployeeService();
//		EmployeeVO ev = new EmployeeVO();
//		ev.setFirstname("Lou");
//		ev.setName("Wernick");
//		ev.setPersonalnumber("123456");
//		ev.setPassword("fahrrad");
//		ev.setUsername("Lou");
//		es.insertEmployee(ev);
//		es.printEmployees();
		System.out.println(es.getEmployeeByFristname("Lou"));
		
	}

}
