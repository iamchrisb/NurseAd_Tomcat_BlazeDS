package mme2.nursead.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import mme2.nursead.model.EmployeeVO;
import mme2.nursead.system.PersistenceManager;

public class EmployeeService {

	public EmployeeVO getEmployeeByFristname(String s) {
		EntityManager em = PersistenceManager.getInstance()
				.createEntityManagerFactory().createEntityManager();

		EmployeeVO e = new EmployeeVO();

		try {
			em.getTransaction().begin();
			e = (EmployeeVO) em
					.createQuery("select a from EmployeeVO a WHERE a.firstname=?1")
					.setParameter(1, s).getSingleResult();
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return e;
	}

	public void insertEmployee(EmployeeVO ev) {
		EntityManager em = PersistenceManager.getInstance()
				.createEntityManagerFactory().createEntityManager();
		try{
			em.getTransaction().begin();
			em.persist(ev);
			em.getTransaction().commit();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		em.close();
	}
	
	public void printEmployees(){
		EntityManager em = PersistenceManager.getInstance()
				.createEntityManagerFactory().createEntityManager();
		
		Query q = em.createQuery("Select m from EmployeeVO m");
		
		List<EmployeeVO> emplist = q.getResultList();
		for (EmployeeVO ev : emplist) {
			System.out.println(ev);
		}
		
		em.close();
	}
	
	public boolean checkEmployee(EmployeeVO e){
		EntityManager em = PersistenceManager.getInstance().createEntityManagerFactory().createEntityManager();
		
		Query q = em.createQuery("Select m rom EmployeeVO m");
		
		List<EmployeeVO> emplist = q.getResultList();
		for(EmployeeVO ev : emplist){
			if(e.equals(ev)) return true;
		}
		return false;
	}
	
	
	public String getName(){
		return "CHRIS";
	}

}
