package day11_NestedIf_Ternary;
// second Task: "can vote" or "cannot vote"
//third task: write a program that can check if two numbers are equal or not
public class Ternary_Practice1 {
    public static void main(String[] args) {
        int age= 16;
        String citizen = "USA";

        String result = "";
        if(age >= 18 && citizen == "USA"){
          result = "Can Vote";
        }else{
            result= "Can NOT Vote";
        }
        System.out.println(result);

        String result2 = (age >= 18 && citizen == "USA") ? "Can Vote" : "Can Not Vote";
        System.out.println(result2);

        System.out.println("===========================================================");

        int n1 = 100;
        int n2 = 200;

        String r = (n1==n2) ? "Equal" : "Not Equal";
        // "equal" or "not equal"

        System.out.println(r);
    }
}
