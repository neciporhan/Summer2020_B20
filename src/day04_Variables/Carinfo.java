package day04_Variables;
//Year, Brand, Model, Mileage, Price

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Carinfo {
    // output should be: 2020 BMW X5, 300 mileage, 45000$

    public static void main(String[] args) {
        int Year = 2019;
        String Brand = "Honda";
        String Model = "Civic";
        int Mileage = 60000;
        double Price = 35000.5;
        String Color = "Black";

        System.out.println(Year+" "+Brand+" "+ Model+", "+Mileage + " miles, $"+Price);

        // 2018 Toyota Corolla Red, 50000 miles, $25000.5
        System.out.println(Year+" "+Brand+" "+ Model+" "+Color+", "+Mileage + " miles, $"+Price);







    }

}
