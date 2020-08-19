package Office_Hours.Practice_06_17_2020;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean r1 = !true != true;
        //           false != true ==> true

        System.out.println(r1);

        boolean r2 = !r1;
        System.out.println(r2);

        System.out.println(!!!!!!true);

        System.out.println("============================================");

        // ||: Either
        boolean result1 = 9>10 || "java"== "java" || 'A' == 'a';
        //                 false     true             false
        // if one of them is true result is going to be ture

        boolean result2 = "Java" != "Python" && "Muhtar" != "Good guy";
        //                      true           &&     true




    }
}
