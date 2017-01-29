
public class HelloUser {
	
	private String userName;
	
	public HelloUser(String name){
		this.userName = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String greetUser(){
		String result = "What a lovely " + userName + " !";
		return result;
	}

}
