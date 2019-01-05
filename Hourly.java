/*
* University of Mississippi - CSCI 112
* Project 3
* Ben Mighall
* July 18th, 2016
*/

public class Hourly extends Staff{
	
	private final double baseHourlyPay = 12.00;
	private int id;
	private StaffInfo info;
	private String position;
	private int startYear;

	public Hourly() {
		id = 0;
		info = new StaffInfo();
		position = "";
		startYear = 0;
	}
	
	public Hourly(String newName, String newAddress, String newCity, String newState, int newID, String newPosition, int newStartYear) {
		info = new StaffInfo(newName, newAddress, newCity, newState);
		id = newID;
		position = newPosition;
		startYear = newStartYear;
	}

	public void setId(int newID) {
		id = newID;
	}

	public void setPosition(String p) {
		position = p;
	}

	public void setStartYear(int sy) {
		startYear = sy;
	}
	
	public int getID(){
		return id;
	}
	
	public String getPosition(){
		return position;
	}
	
	public int getStartYear(){
		return startYear;
	}

	public void addStaffInfo(String n, String a, String c, String s) {
		info.setName(n);
		info.setAddress(a);
		info.setCity(c);
		info.setState(s);
	}

	public void printData() {
		System.out.println("Name: " + info.getName());
		System.out.println("Address: " + info.getAddress());
		System.out.println("City: " + info.getCity());
		System.out.println("State: " + info.getState());
		System.out.println("Position: " + position);
		System.out.println("ID: " + id);
		System.out.println("Year Started: " + startYear);
	}

	public double calculatePay() {
		double hourly = baseHourlyPay + 0.50*(CURRENT_YEAR - startYear);
		return hourly;
	}

}
