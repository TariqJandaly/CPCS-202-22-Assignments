package Girls_22;
/*
    Problem Name: Distance Between Two Points
    Assignment  : 0001
    Problem     : 1015
    Beecrowd    : https://www.beecrowd.com.br/judge/en/problems/view/1015
    Group       : Girls - 22
    Description : The user will input 4 numbers [x1, y1, x2, y2]
                  The code will return 1 output [distance]

                  To calculate the distance between to points we will use this formla
                   - The square root of ((x2 - x1)**2 + (y2 - y1)**2)
                  
                   To get the square root of a number in java we use the Math.sqrt(number) function
                   To get the power of a number we can not use **, we need to use Math.pow(number) function

                 
                   The code will then return the value of [distance]

                  *for more inforamtion read the beecrowd description

                  
    Written by  : @TariqJandaly
*/

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        // Getting the input from the user using the Scanner class
        Scanner input = new Scanner(System.in);
        
        // Getting the values [x1, y1, x2, y2] from the Scanner
        System.out.print("~ ");
        Float x1 = input.nextFloat();
        Float y1 = input.nextFloat();
        Float x2 = input.nextFloat();
        Float y2 = input.nextFloat();

        // Calculating the value of [distance]
        Float distance = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Closing the input Scanner
        input.close();

        // Returning the value of distance to the user
        System.out.println(String.format("%.4f", distance));
    }
}
