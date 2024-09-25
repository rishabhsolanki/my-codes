package abstractFactoryDesignPattern;

public class ClientMain {
	public static void main(String [] args) {
		Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
		e1.name();
		System.out.print(e1.salary());
	}
}
