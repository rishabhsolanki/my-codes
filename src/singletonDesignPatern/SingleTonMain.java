package singletonDesignPatern;

public class SingleTonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon s1 = SingleTon.getSingleTon();
		System.out.println(s1.hashCode());
		SingleTon s2 = SingleTon.getSingleTon();
		System.out.println(s2.hashCode());
	}

}
