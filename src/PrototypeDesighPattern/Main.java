package PrototypeDesighPattern;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("Creating object using prototype design ");
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("192.168.4.3");
		networkConnection.loadimportantData();
		System.out.println(networkConnection);
		
		
		try {
			NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
			networkConnection2.getDomains().remove(0);
			NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
			System.out.println(networkConnection2);
			
			System.out.println(networkConnection3);
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
