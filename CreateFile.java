
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

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File("command_line_input.txt");
        PrintWriter pw = new PrintWriter(f);
        System.out.println("Enter input string : ");
        while (sc.hasNextLine()) {

            String input = sc.nextLine();
            if (input.equals("@q")) {
                break;
            } else {
                pw.write(input + "\n");
            }
        }
        pw.close();
        sc.close();

    }

}
