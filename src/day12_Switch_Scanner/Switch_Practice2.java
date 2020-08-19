package day12_Switch_Scanner;
/* TASK for LUNCH:
write a program that can print out the name of the month based on  the number
ex: ....1
output: "january"
DO NOT use if & ternary
 */
public class Switch_Practice2 {
    public static void main(String[] args) {
        int num = 4;

        switch(num) {

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid");
                break;
        }
        System.out.println("========================================");

        String productName = "MacBook";
        switch(productName){
            case "Galaxy":
                System.out.println("Samsung");
                break;

            case "iphone":
            case "ipad":
            case "MacBook":

                System.out.println("Apple");
                break;

        }
    }
}
