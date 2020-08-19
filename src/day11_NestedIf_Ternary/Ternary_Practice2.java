package day11_NestedIf_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }

        String result2 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result);
        System.out.println(result2);

        System.out.println("=================================================");
        /* write a program that can compare two numbers
        a= 10, b= 20
        output: a is greater

        a= 30, b= 10;
        output: b is greter

        a= 20; b= 20;
        output: a is equal to b

         */

        int a = 20;
        int b = 20;
        String result3 = "";

         if(a > b){
            result3 = a+" is greater";
        } else if(a < b){
            result3 = b+ " is greater";
        }else{
            result3 = a+ " is equal to " +b ;
        }

        System.out.println(result3);

         String result4 = (a > b) ? a+" is greater" : ( b > a ) ? b+ " is greater" : a+" equal to " +b;
        System.out.println(result4);
    }
}
