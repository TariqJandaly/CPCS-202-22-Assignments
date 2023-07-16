package Girls_22;
/*
    Problem Name: Salary
    Assignment  : 0001
    Problem     : 1008
    Beecrowd    : https://www.beecrowd.com.br/judge/en/problems/view/1008
    Group       : Girls - 22
    Description : The user will input 3 numbers [workerNumber, workHours, (float) perHourPaid]
                  The code will return 2 outputs [workerNumber, salary]

                  To calculate the salary we will multiply the workHours with perHourPaid ( workHours * perHourPaid )

                  The code will return:
                    Number: {workerNumber}
                    Salary: {salary} S.R

                  *for more inforamtion read the beecrowd description

                  
    Written by  : @TariqJandaly
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem_1 { // public class Main {
    public static void main(String[] args) throws IOException {
        
        // Getting the input from the user using the Scanner class
        Scanner input = new Scanner(System.in);

        // Getting the values [workerNumber, workHours, (float) perHourPaid] from the Scanner
        System.out.print("~ ");
        Integer workerNumber = input.nextInt();
        Integer workHours = input.nextInt();
        Float perHourPaid = input.nextFloat();

        // Closing the input Scanner
        input.close();

        // Calculating the salary
        Float salary = workHours * perHourPaid;

        // Returning the values to the user
        System.out.println("Number: " + workerNumber);
        System.out.println("Salary: " + salary + " S.R");
    }
}