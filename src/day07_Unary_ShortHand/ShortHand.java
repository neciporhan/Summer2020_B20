package day07_Unary_ShortHand;

public class ShortHand {
    public static void main(String[] args) {
        int a = 10;
        a = a*a;
        a *=a;
        System.out.println(a);


        int b = 2;
        b *= 3;
        System.out.println(b);

        int c = 300;
        c -= 100;
        System.out.println(c);

        System.out.println("===============================");

        // +=:
        int z = 300; // if I wanna assign it to 500. Now what???
        z += 200;
        System.out.println(z);


        String schoolName = "Cybertek";
             // We can allso do this way: schoolName = schoolName+" School";
        // But there is a shorter way which is:
        schoolName += " School";
        System.out.println(schoolName);

        String fullName = "Nick";
        fullName += " Orphan";
        System.out.println(fullName);
        // the only one we can apply to string

        // /= Division Assignment
        int budget = 100000;
        budget /= 2; //quarter means divide by 4
        System.out.println(budget);

        int q = 100;
        System.out.println(q/2); // 50
        System.out.println(q);   // 100

        int x = 100;
        x /=2;
        System.out.println(x);

        x *=2;
        System.out.println(x);


        // %=
        int num = 100;
        num %= 3;
        System.out.println(num);

        double num2 = 400.5;
        num2 %= 2;
        System.out.println(num2);







    }
}
