package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        String firstName = "Nick";
        String lastName = "Orphan";
        String fullName = firstName+ " "+ lastName;
        int age = 19;
        String citizenShip = "USA";
        boolean eligibleToVote = age >= 18 && citizenShip == "USA";

        System.out.println(fullName + " is eligible to vote: "+ eligibleToVote); // Nick Orphan is eligible to vote: true


    }


}
