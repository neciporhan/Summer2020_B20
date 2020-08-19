package day05_ArithmeticOperators;

public class EmployeeInfo2 {

    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Jones";
        char gender = 'M';
        int age = 45;
        String companyName = "CapitalOne";
        String jobTitle = "QA";
        double salary = 120_000.50;
        boolean isFullTime = true;
        boolean isMarried = false;
        String fullName = firstName + " " + lastName;


        System.out.println("Employee's full name is " + fullName);
        System.out.println(fullName+"'s gender is: " +gender);
        System.out.println(fullName + "'s age is: "+age + " years old");
        System.out.println(fullName + " works at: "+companyName);
        System.out.println(fullName+ "" + "'s job title is: "+jobTitle);
        System.out.println(fullName+"'s salary is: $"+salary);
        System.out.println(fullName+" is full time employee: "+ isFullTime);
        System.out.println(fullName+" is married: " + isMarried);




    }

}
