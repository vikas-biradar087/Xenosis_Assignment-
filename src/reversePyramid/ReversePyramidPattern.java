package reversePyramid;

import java.util.Scanner;

public class ReversePyramidPattern {

    public static void main(String[] args) {
    	
    	// here we import scanner class so we can read user as input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        
        //nextInt is non static method present inside the class to read as input as a integer
        int n = scanner.nextInt();
        
        // here we close scanner object
        scanner.close();

        //The outer loop runs from n down to 1 (inclusive) to create each row.
        for (int i = n; i >= 1; i--) {
        	
        	//The inner loop runs from 1 to i (inclusive) to print the numbers in each row.
            for (int j = 1; j <= i; j++) {
            	
            	//Inside the inner loop, each number j is printed followed by a space.
                System.out.print(j + " ");
            }
            
            // so after inner loop complete new line printed
            System.out.println();
        }
    }
}

