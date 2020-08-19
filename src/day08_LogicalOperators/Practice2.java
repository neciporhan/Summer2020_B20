package day08_LogicalOperators;

public class Practice2 {

    public static void main(String[] args) {

        String firstName = "Khabib";
        String lastName = "Legend";
        String fullName = firstName +" "+ lastName;
        int age = 17;
        String citizen1 = "Russia";
        String citizen2 = "USA";

        boolean eligibleAge = age >= 18;
        // 12>= 18 ==> False
        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
        // "USA" =="USA" || "France" == "USA"
        //     true      ||        false
        // true

        boolean eligibleToVote = eligibleAge && usCitizen;
        //                       false &&  true ==> true

        System.out.println(fullName + " is eligible to vote for Trump: " + eligibleToVote);
        // Conor McNugget is eligible to vote for Trump: false




    }

}
