package springprj;

// OCP 개방폐쇄원칙 확장 변경 
// DI 
// IOC 

public class User {
	String id;
	String name;
	String password;
	String aaa; 
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
