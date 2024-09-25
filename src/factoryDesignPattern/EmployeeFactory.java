package factoryDesignPattern;

public class EmployeeFactory {
	public static Employee getEmployee(String empType) {
		if(empType.trim().equalsIgnoreCase("Android Developer"))
			return new AndroidDeveloper();
		else if (empType.trim().contentEquals("Web Developer")) 
			return new WebDeveloper();
		else 
			return null;
	}
}
