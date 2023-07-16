package Girls_22_33;
/*
    Problem Name: Multiples
    Assignment  : 0001
    Problem     : 1008
    Beecrowd    : https://www.beecrowd.com.br/judge/en/problems/view/1044
    Group       : Girls - 22.33
    Description : The user will input 2 numbers [a, b]
                  The code will return 1 output [resulte]

                  The resulte have two possibilities [are multiples ( Sao Multiplos ), aren’t multiples ( Nao sao Multiplos )]

                  To caculate if [a, b] are multiples we will use this formla:
                    a % b && b % a

                  *for more inforamtion read the beecrowd description

                  
    Written by  : @TariqJandaly
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem_1 { // public class Main {
    public static void main(String[] args) throws IOException {
        
        // Getting the input from the user using the Scanner class
        Scanner input = new Scanner(System.in);

        // Getting the values [a, b] from the Scanner
        System.out.print("~ ");
        Integer a = input.nextInt();
        Integer b = input.nextInt();

        // Closing the input Scanner
        input.close();

        // Calculating the salary
        String resulte = "aren't multiples ( Nao sao Multiplos )";

        if(b % a == 0 || a % b == 0) {
            resulte = "are multiples ( Sao Multiplos )";
        }

        // Returning the values to the user
        System.out.println(resulte);
    }
}