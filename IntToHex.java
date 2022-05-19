
/**
 * IntToHex class:
 *  Implement a program that takes command line input from a user,
 *      expecting an integer value, converts it to hexadecimal format 
 *      and outputs the converted value back to command line screen.
 * 
 * @author Thuy Tran
 * May 17, 2022
 */

import java.util.Scanner;
import java.util.InputMismatchException;


public class IntToHex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        try {
            int number = sc.nextInt();
            // convert integer to hex
            String hex = Integer.toHexString(number);
            // display the result
            System.out.println("Hexadecimal representation of number " + number + " is : " + hex.toUpperCase());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Wrong input!, please try again with valid integer number");
            // print the errors
            System.out.println(e);
        }
    }

}
