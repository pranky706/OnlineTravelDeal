package org.Servlet;

public class Customer {

	private String name,email,gender,address,password,phn_number;
	private int id;
	private String squestion,sanswer;
	public String getSquestion() {
		return squestion;
	}
	public void setSquestion(String squestion) {
		this.squestion = squestion;
	}
	public String getSanswer() {
		return sanswer;
	}
	public void setSanswer(String sanswer) {
		this.sanswer = sanswer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhn_number() {
		return phn_number;
	}
	public void setPhn_number( String phn_number) {
		this.phn_number = phn_number;
	}
	public Customer( int id,String name, String gender, String address,
			String phn_number) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phn_number = phn_number;
		this.id = id;
	}
	public Customer() {
		super();
	}
	public Customer(String name, String gender, String address,  String phn_number) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phn_number = phn_number;
	}
	public Customer(String name, String email, String gender, String address,
			String password, String phn_number) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.password = password;
		this.phn_number = phn_number;
	}
	public Customer(int id,String name,  String address, String gender, String phn_number,
			String email,String password) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.password = password;
		this.phn_number = phn_number;
		this.id = id;
	}
	public Customer( int id, String name, String address, String gender, String phn_number, String email,
			String password,String squestion,
			String sanswer) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.password = password;
		this.phn_number = phn_number;
		this.id = id;
		this.squestion = squestion;
		this.sanswer = sanswer;
	}
}
