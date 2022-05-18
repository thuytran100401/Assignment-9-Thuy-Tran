
/**
 * ReadFileInput class:
 *  Implement a program that reads in a text file quote.txt.
 *  outputs its contents to the command line screen.
 * 
 * @author Thuy Tran
 * May 17, 2022
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInput {

    public static void main(String[] args) throws IOException {
        File file = new File("quote.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String lines = br.readLine();
        while (lines != null) {
            System.out.println("The contents in the file are: ");
            System.out.println(lines);
            lines = br.readLine();
        }
        br.close();
    }

}
