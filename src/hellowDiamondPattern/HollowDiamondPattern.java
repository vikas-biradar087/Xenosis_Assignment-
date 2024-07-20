package hellowDiamondPattern;

import java.util.Scanner;

public class HollowDiamondPattern {

    public static void main(String[] args) {
    	
    	//we initializes a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        
        //it wil Reads the integer input from the user.
        int n = scanner.nextInt();
        
        // // here we close scanner object
        scanner.close();

        //The total number of rows diamond pattern
        int totalRows = 2 * n - 1;

        // this is outer loop runs from 1 to totalRows
        for (int i = 1; i <= totalRows; i++) {
        	
        	//Calculate Spaces and Stars
            int spaces = Math.abs(n - i);
            
            
            int stars = totalRows - 2 * spaces;

            //innner loop from the spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //inner loop from the star
            for (int j = 1; j <= stars; j++) {
            	
                if (j == 1 || j == stars) {
                	
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //After the inner loops complete, a new line is printed to move to the next row.
            System.out.println();
        }
    }
}

