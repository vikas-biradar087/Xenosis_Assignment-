package divisionByUserInput;

import java.util.Scanner;

public class DivisionByUserInput {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		int fixedNumber=10;
		
		try {
			System.out.println("Enter a number :"+" "+fixedNumber);
			
			//Reads the integer input from the user.
			int userNumber = scn.nextInt();
		
			//Attempt to divide the fixed number by the user-provided number
			int result = fixedNumber / userNumber;
			
            System.out.println(fixedNumber + " divided by " + userNumber + " is " + result);
            
		} catch (ArithmeticException e) {
			
			System.out.println("Division by zero is not allowed !!");
			
			//Catches division by zero and prints an appropriate error message.
		}catch (Exception e) {
			
			System.out.println("Unexpeted error occurred !!"+e.getMessage());
			
			// whether exception occurs or not finally block will run
		}finally {
			
			// Cleanup operations, like closing the scanner
            System.out.println("Cleaning up resources...");
            
			scn.close();
		}
	}

}
