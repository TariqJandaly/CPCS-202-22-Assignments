package Boys_22_5;
/*
    Problem Name: Consumption
    Assignment  : 0001
    Problem     : 1014
    Beecrowd    : https://www.beecrowd.com.br/judge/en/problems/view/1014
    Group       : Boys - 22.5
    Description : The user will input 2 floats [km, liters]
                  The code will return one value [averageConsumption]

                  To calculate the value of averageConsumption we will use (km / liters)
                  and then it will be formated to only have 3 digits after the decimal point

                  The code will return
                    {averageConsumption}km/l

                  *for more inforamtion read the beecrowd description

                  
    Written by  : @TariqJandaly
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem_2 { // public class Main {
    public static void main(String[] args) throws IOException {

        // Getting the input from the user using the Scanner class
        Scanner input = new Scanner(System.in);
        
        // Getting the values [km, liters] from the Scanner
        System.out.print("~ ");
        Float km = input.nextFloat();
        Float liters = input.nextFloat();

        // Closing the input Scanner
        input.close();

        // Calculating [averageConsumption]
        Float averageConsumption = km / liters;
        averageConsumption = Float.valueOf(String.format("%.3f", averageConsumption));

        // Returning the values [newSalary, moneyEarned, inPercentage]
        System.out.println(averageConsumption + "km/l");
    }
}