package Girls_22_33;
/*
    Problem Name: Age in Days
    Assignment  : 0001
    Problem     : 1020
    Beecrowd    : https://www.beecrowd.com.br/judge/en/problems/view/1020
    Group       : Girls - 22.33
    Description : The user will input one number [rawDays]
                  The code will return 3 values [years, months, days]

                  To calculate the years we will use : rawDays / 365
                  To calculate the months we will use: (rawDays % 365) / 360
                  To calculate the days we will use  : (rawDays % 365) % 360

                  In the code it was simplified but it got the same idea

                  *for more inforamtion read the beecrowd description
                  

    Written by  : @TariqJandaly
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem_3 { // public class Main {
    public static void main(String[] args) throws IOException {
        
        // Getting the input from the user using the Scanner class
        Scanner input = new Scanner(System.in);

        // Getting the value [days] from the Scanner
        System.out.print("~ ");
        Integer rawDays = input.nextInt();

        // Closing the input Scanner
        input.close();

        // Calculating the values of [years, months, days]
        Integer years = rawDays / 365;
        Integer months = rawDays % 365;
        Integer days = months % 30;
        months = months / 30;

        // Returning the valus to the user
        System.out.println(years  + " ano(s) - years");
        System.out.println(months + " mes(es) - months");
        System.out.println(days   + " dia(s) - days");


    }    
}