package factoryDesignPattern;

public class WebDeveloper implements Employee {
	
	@Override
	public int salary() {
		System.out.println("Getting Web Developer Salary !");
		return 50000;
	}
}
