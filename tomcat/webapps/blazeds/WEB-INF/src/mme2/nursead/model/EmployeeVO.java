package mme2.nursead.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	private String firstname;
	private String personalnumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getPersonalnumber() {
		return personalnumber;
	}
	public void setPersonalnumber(String personalnumber) {
		this.personalnumber = personalnumber;
	}
	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", name=" + name + ", firstname="
				+ firstname + ", personalnumber=" + personalnumber + "]";
	}

}
