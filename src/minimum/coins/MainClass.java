package minimum.coins;

import java.util.Scanner;

public class MainClass{ 

	public static void main(String [] args){
		//Visibility, Type, Variable Name
		 int quarters = 0;
		 int dimes = 0;
		 int nickels = 0;
		 int change = 0;
		 int userNumber;
		 
		 //Instance or declaring variable name
		 Scanner userInput = new Scanner(System.in);
		 System.out.println("Please enter amount of change. (1-99)");
		 userNumber = userInput.nextInt();
		 
		 if (userNumber >= 25)
		 {
			 while (userNumber >= 25)
			 {
				 quarters = quarters + 1;
				 userNumber = userNumber - 25; 	 
			 }
		 }
		 
		 if (userNumber >=10 )
		 {
			 while (userNumber >= 10)
			 {
				 dimes = dimes + 1;
				 userNumber = userNumber - 10;
			 }
		 }
		 
		 if (userNumber >= 5)
		 {
			 while (userNumber >= 5)
			 {
				nickels = nickels + 1;
				userNumber = userNumber - 5;
			 }
		 }
		 
		 if (userNumber >= 1)
		 {
			 while(userNumber >= 1)
			 { 
				 change = change + 1;
				 userNumber = userNumber - 1;
			 }
		 }
			 System.out.println("Quarters: " + quarters);
			 System.out.println("Dimes: " + dimes);
			 System.out.println("Nickels: " + nickels);
			 System.out.println("Pennies: " + change);
			 userInput.close();
	}
	
}
