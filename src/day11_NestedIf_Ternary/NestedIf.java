package day11_NestedIf_Ternary;

/*

 */

public class NestedIf {
    public static void main(String[] args) {
        int score = 100;
        String result = "";

        if (score >= 0 && score <= 100){

            if(score >= 90){
                result = "A";
            } else if(score >= 80){
                result = "B";
            } else if (score >= 70){
                result = "C";
            } else if (score>= 60 && score < 70){
                result = "D";
            }else{
                result = "F";
            }

        }else{ // represents the invalid score
            result = "Invalid";

        }
        System.out.println(result);

        System.out.println("===============================================================");
        /*
        Task 1:
        precondition: minimum salary of 30k
        sub condition: minumum 2 years of job history

        Task 2:
        1 Monday
        2 Tuesday
        ...
        7 Sunday
        invalid==> There is no such day

         */

    }
}
