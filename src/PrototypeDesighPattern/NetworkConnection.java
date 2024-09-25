package PrototypeDesighPattern;
import java.util.*;
public class NetworkConnection implements Cloneable {
	private String ip;
	private String importantData;
	private List<String> domains = new ArrayList<String>();
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImportantData() {
		return importantData;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	public void loadimportantData() throws InterruptedException {
		this.importantData = "this is very very important data";
		domains.add("https://googlee.com");
		domains.add("https://hoogle.com");
		domains.add("https://mugal.com");
		domains.add("https://rigall.com");
		Thread.sleep(5000);
		//this is very time takingg
	}
	@Override
	public String toString() {
		return "" + ip + " " + importantData + " "+domains;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//logic for cloning
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp(this.getIp());
		networkConnection.setImportantData(this.getImportantData());
		for(String d: this.getDomains()) {
			networkConnection.getDomains().add(d);
		}
		return networkConnection;
	}
	
}
