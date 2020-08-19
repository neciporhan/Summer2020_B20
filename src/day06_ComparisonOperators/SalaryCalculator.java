package day06_ComparisonOperators;

/* task02:
        Create a class CompanyInfo
                Declare variables:
        companyName
        address
        numberOfEmployees
        revenue
        isTechCompany
        Print statements and describe each value:
        Company name is Facebook
        address is ...
        Number of employees is 100
        Annual revenue is 4 000 000
        is it tech company? - true
 */


public class SalaryCalculator {

    public static void main(String[] args) {
        double rate = 55;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.22;
        int weeklyHours= 48;

        double salary = rate*weeklyHours*48;
        double totalTax = salary * (stateTaxRate+federalTaxRate);
        double salaryAfterTax = salary-totalTax;


        System.out.println("Salary before tax: " +salary+ " USD");
        System.out.println("Total tax: " +totalTax+ " USD");
        System.out.println("Take home salary: " +salaryAfterTax+ " USD");



    }


}
