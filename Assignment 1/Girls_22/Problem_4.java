package Girls_22;
/*
    Problem Name: Average
    Assignment  : 0001
    Problem     : 1006
    Beecrowd    : https://www.beecrowd.com.br/judge/en/problems/view/1006
    Group       : Girls - 22
    Description : The user will input 3 floats [a, b, c]
                  The code will return the value of [average]

                  a will have the weight of 2: a*2
                  b will have the weight of 3: a*3
                  c will have the weight of 5: a*5

                  affter calculating the values of [a, b, c] we will divide it by 10

                  so the value of average will be (a*2 + b*3 + c*5) / 10
                  
                  !Note: The average must have only one decimal place

                  *for more inforamtion read the beecrowd description
                  

    Written by  : @TariqJandaly
*/

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        // Getting the input from the user using the Scanner class
        Scanner input = new Scanner(System.in);
        
        // Getting the values [a, b, c] from the Scanner
        System.out.print("~ ");
        Float a = input.nextFloat();
        Float b = input.nextFloat();
        Float c = input.nextFloat();

        // Closing the input Scanner
        input.close();

        // Calculating the values of [a, b, c, average]
        a = a*2;
        b = b*3;
        c = c*5;

        Float average = (a + b + c) / 10;

        // Returning the value to the user
        System.out.println(String.format("Average: %.1f", average));
    }
}
