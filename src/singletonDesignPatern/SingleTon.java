package singletonDesignPatern;

public class SingleTon {
	
	private static SingleTon singleton;
	
	//constructor
	private SingleTon() {
		
	}
	public static SingleTon getSingleTon() {
		synchronized (SingleTon.class) {
			if(singleton==null) {
				 singleton = new SingleTon();		
				}
			
		}
//		if(singleton==null) {
//		 singleton = new SingleTon();		
//		}
		return singleton;
	}
}

/*constructor should be private
 * object create with the help of method
 * create field to store object is Private
 * 
 * 
 * 
 *
 */