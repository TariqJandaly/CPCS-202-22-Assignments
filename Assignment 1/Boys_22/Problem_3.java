package Boys_22;
/*
    Problem Name: Distance
    Assignment  : 0001
    Problem     : 1016
    Beecrowd    : https://www.beecrowd.com.br/judge/en/problems/view/1016
    Group       : Boys - 22
    Description : The user will input one number [KM]
                  The code will return the value of [liters]

                  In order to get liters we will multiply KM by 2 (KM * 2)

                  *for more inforamtion read the beecrowd description

                  
    Written by  : @TariqJandaly
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem_3 { // public class Main {
    public static void main(String[] args) throws IOException {
        
        // Getting the input from the user using the Scanner class
        Scanner input = new Scanner(System.in);

        // Getting the values [name, salary, sales] from the Scanner
        System.out.print("~ ");
        Integer KM = input.nextInt();

        // Closing the input Scanner
        input.close();

        // Calualting [newKM]
        Integer liters = KM * 2;

        // Returning the value of [newKM] to the user
        System.out.println("Liters: " + liters);
    }    
}