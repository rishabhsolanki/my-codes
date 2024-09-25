package BuilderDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		User user = new User.UserBuilder()
				.setEmailId("rishabh@dev.in")
				.setUserId("User123Id").setUserName("Rishabh")
				.build();
		System.out.print(user.toString());

	}

}
