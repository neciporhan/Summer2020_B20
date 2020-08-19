package day05_ArithmeticOperators;

/* Warm up tasks:
      1. create a class named EmployeeInfo
                  declare the following variables:
                           firstName
                           lastName
                           gender
                           age
                           companyName
                           jobTitle
                           isFullTime
                           isMarried
                           salary */


public class EmployeeInfo {
    public static void main(String[] args) {

    String firstName = "John";
    String lastName = "Daniel";
    char gender = 'M';
    int age = 35;
    String companyName = "CapitalOne";
    String jobTitle = "SDET";
    double salary = 120_000.50;
    boolean isFullTime = true;
    boolean isMarried = false;




    System.out.println("Employee' full name is " + firstName + " " + lastName);
    System.out.println(firstName + " " + lastName+" ' gender is: " +gender);
    System.out.println(firstName + " " + lastName + "' age is: "+age + " years old");
    System.out.println(firstName + " " + lastName + " works at: "+companyName);
    System.out.println(firstName + " " + lastName+ "" + "' job title is: "+jobTitle);
    System.out.println(firstName + " " + lastName+"' salary is: $"+salary);
    System.out.println(firstName + " " + lastName+" is fulltime employee: "+ isFullTime);
    System.out.println(firstName + " " + lastName+" is married: " + isMarried);




    }

}