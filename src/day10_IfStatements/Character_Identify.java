package day10_IfStatements;
/*1. write a program that can identify if the given character character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z
 */

public class Character_Identify {
    public static void main(String[] args) {
        char character = '@';
        //                        65 <= character <= 90             ||   97 <= character <= 122
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
        //           upper case letters     ||  lower Case letter

        // 48 <= CHARACTER <= 57
        boolean isDigit = character >= 48  && character <= 57;

        boolean specialChar = isAlphabetic == false && isDigit == false;
        // !isAlphabetic && !isDigit

        String alphabet = "";

        if(isAlphabetic == true) {
            //    System.out.println(character + " is Alphabetic character");
            alphabet = character + " is Alphabetic character";

        }else {
            //   System.out.println(character + " is not Alphabetic character");
            alphabet = character + " is not Alphabetic character";
        }

        System.out.println(alphabet);


        String digit = "";

        if(isDigit == true ){
            digit = character+" is a digit";
        }else{
            digit =  character+" is not a digit";
        }

        System.out.println(digit);


        String specialCharacter = "";
        if(specialChar == true){
            specialCharacter = character+" is a special character";
        }else{
            specialCharacter = character+" is not a special character";
        }

        System.out.println(specialCharacter);

    }
}
