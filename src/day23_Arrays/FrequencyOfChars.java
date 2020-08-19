package day23_Arrays;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String str = "ABAB";  //"A2B2"
        String nonDup = "";  //"AB"
        String result = "";  //"A2B2"


        for(int i = 0; i <= str.length()-1; i++){  // removing duplicates from str
            String ch = ""+ str.charAt(i);  // A, B, A, B
            if(!nonDup.contains( ch )){
                nonDup += ch;
            }
        }

        System.out.println(nonDup);

        // str ="ABAB"     nonDup = "AB"

        for(int j=0; j <= nonDup.length()-1; j++ ){

            char ch = nonDup.charAt(j);
            int count = 0;
            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == ch){
                    count+=1;
                }
            }

            result += ""+ch + count;

        }

        System.out.println(result);

/*
import java.util.Scanner;

public class FrequencyOfChars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String nonDup = "";  //"BCD"
                // ab

        for(int i =0; i <= str.length()-1; i++){  // remove duplciates from str and added to nonDup
            String ch = ""+ str.charAt(i);   // B, B, C, C, D, D

            if(nonDup.contains(ch)){
                continue;
            }else{
                nonDup += ch;
            }

        }

         String expectedResult = "";    //"B2C2D2"

        // str = "BBCCDD"      nonDup = "BCD"    ===> "B2C2D2"

        for(int j=0; j <= nonDup.length()-1; j++){ // iterates the string nonDup

            char ch = nonDup.charAt(j);  // B, C, D   every single characters from nonDup
            int count = 0; // 2,  2,   2    frequnecy of every single ch

            for(int i=0; i <= str.length()-1; i++){  // returns the frequnecy of each ch from string str
                if(str.charAt(i) == ch){
                    count++;
                }
            }

            expectedResult += ""+ch + count;

        }


        System.out.println(expectedResult);


    }

}
 */
    }

}