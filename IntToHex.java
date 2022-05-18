import java.util.Scanner;

public class IntToHex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        try {
            int num = sc.nextInt();
            String hex = Integer.toHexString(num);
            System.out.println("Hexadecimal representation of number " + num + " is : " + hex.toUpperCase());
        } catch (NumberFormatException nfe) {
            System.out.println("Wrong input!, please try again with valid integer number");
        }
    }

}
