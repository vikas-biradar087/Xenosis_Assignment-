package decimalTohexdecimal;

import java.util.Scanner;

public class DecimalToHexadecimal {

    // here we create Method to convert decimal to hexadecimal
	
    public static String decimalToHex(int decimal) {
    	
        // case for 0
        if (decimal == 0) {
            return "0";
        }

        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        // then here i have Convert decimal to hexadecimal
        while (decimal > 0) {
        	
            int remainder = decimal % 16; //it will Find the remainder when divided by 16
            
            hex.insert(0, hexChars[remainder]); // it will Insert corresponding hex character at the beginning
            
            decimal = decimal / 16; // Divide the number by 16 for next iteration
        }

        return hex.toString(); // Return the hexadecimal string
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number:!! ");
        
        int decimal = scanner.nextInt();
        scanner.close();

        String hex = decimalToHex(decimal);
        
        System.out.println("Hexadecimal equivalent: " + hex);
    }
}
