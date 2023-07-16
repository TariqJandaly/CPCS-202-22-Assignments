package Boys_22_5;
/*
    Problem Name: Welcome to the Winter!
    assignment  : 0001
    Problem     : 1847
    Beecrowd    : https://www.beecrowd.com.br/judge/en/problems/view/1847
    Group       : Boys - 22.5
    Description : The user will input 3 numbers [a, b, c]
                  The code will return one value [resulte]

                  To know how I calculated the resulte check out these conditions
                   - If the temperature decreased from the 1st to the 2nd day, but increased or remained constant from the 2nd to the 3rd, the people are happy (first figure).

                   - If the temperature increased from the 1st to the 2nd day, but decreased or remained constant from the 2nd to the 3rd, the people are sad (second figure).

                   - If the temperature increased from the 1st to the 2nd day and from the 2nd to the 3rd, but increased from the 2nd to the 3rd less than what had increased from the 1st to the 2nd, the people are sad (third figure).

                   - If the temperature increased from the 1st to the 2nd day and from the 2nd to the 3rd, but increased from the 2nd to the 3rd at least what had increased from the 1st to the 2nd, the people are happy (fourth figure).

                   - If the temperature decreased from the 1st to the 2nd day and from the 2nd to the 3rd, but decreased from the 2nd to the 3rd less than what had decreased from the 1st to the 2nd, the people are happy (fifth figure).

                   - If the temperature decreased from the 1st to the 2nd day and from the 2nd to the 3rd, but decreased from the 2nd to the 3rd at least what had decreased from the 1st to the 2nd, the people are sad (sixth figure).

                   - If the temperature remained constant from the 1st to the 2nd day, the people are happy if the temperature increased from the 2nd to the 3rd or sad otherwise (respectively, seventh and eighth figures).

                  *for more inforamtion read the beecrowd description

                  
    Written by  : @TariqJandaly
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem_3 { // public class Main {
    public static void main(String[] args) throws IOException {

        // Getting the input from the user using the Scanner class
        Scanner input = new Scanner(System.in);
        
        // Getting the values [a, b, c] from the Scanner
        System.out.print("~ ");
        Float a = input.nextFloat();
        Float b = input.nextFloat();
        Float c = input.nextFloat();

        // Closing the input Scanner
        input.close();

        // Calculating the resulte
        String resulte = "";

        if (b < a && c >= b) resulte = ":)";
        else if (b > a && c <= b) resulte = ":(";
        else if (b > a && c > b && (c - b) < (b - a)) resulte = ":(";
        else if (b > a && c > b && (c - b) >= (b - a)) resulte = ":)";
        else if (b < a && c < b && (b - c) < (a - b)) resulte = ":)";
        else if (b < a && c < b && (b - c) >= (a - b)) resulte = ":(";
        else if (b == a && c > b) resulte = ":)";
        else if (b == a && c < b) resulte = ":(";
        else resulte = ":(";

        // Returning the value of resulte

        System.out.println(resulte);
    }
}