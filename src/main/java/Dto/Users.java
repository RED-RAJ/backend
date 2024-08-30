package Dto;

public class Users {
	private String Username;
	private String eamail;
	private String password;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEamail() {
		return eamail;
	}
	public void setEamail(String eamail) {
		this.eamail = eamail;
	}
	public String getPassword() {
		return password;
	}
	public Users(String username, String eamail, String password) {
		super();
		Username = username;
		this.eamail = eamail;
		this.password = password;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
