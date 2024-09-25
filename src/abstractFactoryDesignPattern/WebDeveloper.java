package abstractFactoryDesignPattern;

public class WebDeveloper implements Employee{
	public int salary() {
		return 4000;
	}
	
	public String name() {
		System.out.println("I am Web developer");
		return "WEB DEVELOPER";
	}

}
