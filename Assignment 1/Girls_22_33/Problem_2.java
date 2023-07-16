package Girls_22_33;
/*
    Problem Name: Fuel Spent
    Assignment  : 0001
    Problem     : 1017
    Beecrowd    : https://www.beecrowd.com.br/judge/en/problems/view/1017
    Group       : Girls - 22.33
    Description : The user will input 2 numbers [hours, KmH]
                  The code will return the value [liter]

                  We will use this formla to calculate [liters], ((hours * KmH) / 12)

                  *for more inforamtion read the beecrowd description
                  

    Written by  : @TariqJandaly
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem_2 { // public class Main {
    public static void main(String[] args) throws IOException {
        
        // Getting the input from the user using the Scanner class
        Scanner input = new Scanner(System.in);

        // Getting the values [hours, KmH] from the Scanner
        System.out.print("~ ");
        double hours = input.nextDouble();
        double KmH = input.nextDouble();

        // Closing the input Scanner
        input.close();

        // Calualting [liters]
        double liters = (hours * KmH) / 12;

        // Returning the value of [liters] to the user
        System.out.println("Liters: " + liters);
    }    
}