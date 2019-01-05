/*/*
* University of Mississippi - CSCI 112
* Project 3
* Ben Mighall
* July 18th, 2016
*/

public abstract class Staff {

	public static final int CURRENT_YEAR = 2016;
	
	public abstract void setId(int newID);
	public abstract void setPosition(String p);
	public abstract void setStartYear(int sy);
	public abstract void addStaffInfo(String n, String a, String c, String s);
	public abstract void printData();
	public abstract double calculatePay();
		
}
