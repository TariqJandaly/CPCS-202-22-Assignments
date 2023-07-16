package Boys_22;
/*
    Problem Name: Difference
    Assignment  : 0001
    Problem     : 1007
    Beecrowd    : https://www.beecrowd.com.br/judge/en/problems/view/1007
    Group       : Boys - 22
    Description : The user will input 4 numbers [a, b, c, d]
                  The code will return 1 output [ab - cd]

                  The code will multiply a and b and save it as ab
                  The code will multiply c and d and save it as cd

                  The code will return a value of ab - cd to the user

                  *for more inforamtion read the beecrowd description

                  
    Written by  : @TariqJandaly
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem_1 { // public class Main {
    public static void main(String[] args) throws IOException {
        
        // Getting the input from the user using the Scanner class
        Scanner input = new Scanner(System.in);

        // Getting the values [a, b, c, d] from the Scanner
        System.out.print("~ ");
        Integer a = input.nextInt();
        Integer b = input.nextInt();
        Integer c = input.nextInt();
        Integer d = input.nextInt();

        // Closing the input Scanner
        input.close();

        // Calculating [ab, cd]
        Integer ab = a * b;
        Integer cd = c * d;

        // Returning the value of [ab - cd] to the user
        Integer Difference = ab - cd;
        System.out.println("Difference: " + Difference);

    }    
}