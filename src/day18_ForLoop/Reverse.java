package day18_ForLoop;

/*
2. write a program that can reverse the following string:
                String str = "2. write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt methodava";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
 */

public class Reverse {

    public static void main(String[] args) {
        String str = "Python";
        // avaJ ==> ava , J

        String s1 = str.substring(1);  //"ava"

        String s2 = str.substring(0,1 ); //"J"

        // char ch1 = str.charAt(0);

        String result1 = s1+s2; // "avaJ"

        System.out.println(result1);  /// ythonP

// programming  ==> gnimmargorp


        /*
      import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        String str = "Python";
        Scanner scan= new Scanner(System.in);
        String str = scan.next();
                // avaJ ==> ava , J

           String s1 = str.substring(1);  //"ava"
@@ -31,7 +34,7 @@ public static void main(String[] args) {

        String result1 = s1+s2; // "avaJ"

        System.out.println(result1);  /// ythonP
        System.out.println(result1);

// programming  ==> gnimmargorp

    }
       */

    }
}
