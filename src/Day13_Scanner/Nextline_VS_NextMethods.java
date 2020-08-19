package Day13_Scanner;

import java.util.Scanner;

public class Nextline_VS_NextMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble(); // 120000Enter

        scan.nextLine(); // Enter
        // We use this to take out the enter that are left in the scanner


        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("full name: "+fullName);


    }
}
