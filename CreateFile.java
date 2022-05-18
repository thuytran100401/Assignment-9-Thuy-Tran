
/**
 * CreateFile class:
 * Implement a program that takes command line input from a user and outputs it
 * to a file named command_line_input.txt.
 * 
 * appended to the end of this file when the user keeps entering input.
 * 
 * When the user presses @q the command line input
 * should end and the file should be closed and saved.
 * 
 * implement all necessary exception handling to account for invalid use cases.
 * 
 * @author Thuy Tran
 *         May 18, 2022
 */

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            // create a writer to append input to the end of the file
            FileWriter writer = new FileWriter("command_line_input.txt");

            // enter input
            String input;
            System.out.println("Input: ");
            input = sc.nextLine();

            // use "@q" to close and save the file
            while (!input.equals("@q")) {
                writer.write(input + "\n");
                input = sc.nextLine();
            }
            writer.close();
            sc.close();
            System.out.println("Successfully wrote input to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}