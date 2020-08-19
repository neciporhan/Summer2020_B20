package day06_ComparisonOperators;

public class RelationalOperators {

    public static void main(String[] args) {

        boolean r1 = 10> 9;
        System.out.println(r1);

        boolean r2 = 100 < 9000;
        System.out.println(r2);

        // >=
        boolean r3 = 87 >= 85;
        System.out.println(r3);

        boolean r4 = 877 >= 878;
        System.out.println(r4);

        // <=
        boolean r5 = 200 <= 300;
        System.out.println(r5);

        // ==: equal
        boolean r6 = 900 ==800;
        System.out.println(r6);

        boolean r7 = true ==false;
        System.out.println(r7);

        boolean r8 = "Muhtar" == "Good Guy"; //False If it was "Muhtar" also, it would be true.
        System.out.println(r8);

        boolean r9 = "muhtar" == "MUHTAR"; //false because of the case sensitivity
        System.out.println(r9);
        
        // boolean r10 = "123" == 123;

        // !=
        boolean r11 = "Muhtar" != "bad Guy";
        System.out.println(r11);

        boolean r12 = true != false;
        System.out.println(r12);

        boolean result1 = 'A' ==65;
        System.out.println(result1);


        boolean result2 = 100 == 100.0;
        System.out.println(result2);

        boolean result3 = 10 == (int) 10.9999999;
        System.out.println(result3);

        boolean result4 = "100" == "100.0";
        System.out.println(result4);


        // 100 verify 100 even or not??? 100%2 = remainder is equal to 0 it is a even number. If it is not it a odd number.
        int number = 100;
        boolean even = number%2 ==0;
        boolean odd = number%2 != 0;

        System.out.println(even);
        System.out.println(odd);

        // int a = 100;
        // a = 200;
        // = vs ==


        int x = 1000; // condition divisible by 2, 3, 5 and 10
        boolean resultx = x%3 ==0;
        System.out.println(resultx);

        int x2 = 1000;
        boolean resultx2 = x%5 ==0;
        System.out.println(resultx2);

        int x3 =1000;
        boolean resultx3 = x%10 ==0;
        System.out.println(resultx);

        int x1 = 1000;
        boolean resultx1 = x1%2 ==0;
        System.out.println(resultx1);







    }


}
