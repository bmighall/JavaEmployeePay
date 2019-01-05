/*
* University of Mississippi - CSCI 112
* Project 3
* Ben Mighall
* July 18th, 2016
*/

import java.text.DecimalFormat;

public class Driver {

	public static void main(String[] args) {
		
		String name = "Gamershore LLC";
		DecimalFormat decimal = new DecimalFormat("$#.00");
		Staff[] employees = new Staff[7];
		employees[0] = new Salaried("Brennon O'Neill", "204 W. Samson Blvd", "Vancouver", "WA", 1000, "CEO", 2007);
		employees[1] = new Salaried("Tucker Boner", "4502 State Hwy 98", "Baltimore", "MD", 1001, "Manager", 2009); 
		//Don't make fun of Tucker, that's actually his name.
		employees[2] = new Salaried("Tom Cassell", "43 Northhampton Street", "Manchester", "NH", 1002, "Manager", 2015);
		employees[3] = new Hourly("Robbie Richards", "847 Main Street", "Omaha", "NE", 1003, "Content Creator", 2016);
		employees[4] = new Hourly("Sam Peterson", "9899 E. Washington Blvd", "Madison", "WI", 1004, "Content Creator", 2010);
		employees[5] = new Hourly("Trevor Martin", "145 N. Sellout Blvd", "Orlando", "FL", 1005, "Content Creator", 2011);
		employees[6] = new Internship("Sonja Reid", "4329 N. Sailor Ave.", "Sarnia", "ON", 1006, "Content Intern", 2015);

		System.out.println("Hello, and welcome to the Company Info page for " + name + "!");
		System.out.println("\nHere is the data:");
		System.out.println("\n********************************************************\n");
		
		for(int i = 0; i < employees.length; i++){
			employees[i].printData();
			System.out.print("Wage: " + decimal.format(employees[i].calculatePay()));
			//following part is to help label the hourly/monthly salaries to denote their exact pay rate
			if(employees[i].calculatePay() > 30){
				System.out.print(" per month");
			}else if(employees[i].calculatePay() == 0){
				System.out.print("; N/A Due To Unpaid Internship");
			}else{
				System.out.print(" per hour");
			}
			System.out.println("\n\n********************************************************\n");
		}
		
		System.out.println("Thanks for using this program! Goodbye!");
		
	}

}
