package com.zc.register.bean;

public class RegisterBean {

	private String uname, upass, uemail;
	private int uphone;
	
	public RegisterBean() {
		super();
	}
	
	public RegisterBean(String uname, String upass, String uemail, int uphone) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.uemail = uemail;
		this.uphone = uphone;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public int getUphone() {
		return uphone;
	}
	public void setUphone(int uphone) {
		this.uphone = uphone;
	}
	
}
