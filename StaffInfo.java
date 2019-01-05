/*
* University of Mississippi - CSCI 112
* Project 3
* Ben Mighall
* July 18th, 2016
*/

public class StaffInfo {

	private String name; 
	private String address;
	private String city;
	private String state;
	
	public StaffInfo() {
		name = "";
		address = "";
		city = "";
		state = "";
	}
	
	public StaffInfo(String newName, String newAddress, String newCity, String newState){
		name = newName;
		address = newAddress;
		city = newCity;
		state = newState;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public void setAddress(String newAddress){
		address = newAddress;
	}

	public void setCity(String newCity){
		city = newCity;
	}

	public void setState(String newState){
		state = newState;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getState(){
		return state;
	}
	
	public String toString(){
		String s = name + "; " + address + "; " + city + "; " + state;
		return s;
	}

}
