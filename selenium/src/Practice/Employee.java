package Practice;

import java.io.Serializable;

public class Employee implements Serializable  {

	int eid ; 
	String name  ; 
	
	Employee() {}

	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	} 

}
