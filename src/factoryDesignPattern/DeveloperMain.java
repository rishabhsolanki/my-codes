package factoryDesignPattern;

public class DeveloperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = EmployeeFactory.getEmployee("Web Developer");
		System.out.println(employee1.salary());
		
		Employee employee2 = EmployeeFactory.getEmployee("Android Developer");
		System.out.println(employee2.salary());
	
	}

}

/*
 * When there is super and multiple subclasses and we wanted object of 
 * subclass on the basis of input or requirement ,
 * Then we create factory class which takes full responsiblility of creating of object
 * of class base on the input.
 * 
 *   ADVANTAGES OH FACTORY DESIGN
 * focus on creating object for Interface rather than implementation
 * loose coupling and more robust code   
*/
