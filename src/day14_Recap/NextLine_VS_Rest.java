package day14_Recap;
import java.util.Scanner;

public class NextLine_VS_Rest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Enter your full Name: ");
        String fullName = input.nextLine();
        System.out.println("Enter the company Name: ");
        String companyName = input.nextLine();
        System.out.println(fullName+" is "+age+" years old: ");





    }
}
