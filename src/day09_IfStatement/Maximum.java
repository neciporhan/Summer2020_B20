package day09_IfStatement;

/* warmup tasks:

    1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
 */

public class Maximum {
    public static void main(String[] args) {
        double a = 500;
        double b = 200;
        double c = 300;

        boolean aIsMax = a>b && a>c;
        boolean bIsMax = b>a && b>c;

        boolean cIsMax = c>b && c>a;
                // aIsMax && bIsMax;
                // aIsMax == false && bIsMax == false;
        double max = 0; // we want to assign the maximum number to variable max

        if(aIsMax){
            // System.out.println(a);
            max = a;
        }
        if(bIsMax){
           // System.out.println(b);
            max = b;
        }
        if(cIsMax){
            //System.out.println(c);
            max = c;

        }
        System.out.println(max + " is maximum number");



    }


}
