package Boys_22_5;
/*
    Problem Name: Salary Increase
    Assignment  : 0001
    Problem     : 1048
    Beecrowd    : https://www.beecrowd.com.br/judge/en/problems/view/1048
    Group       : Boys - 22.5
    Description : The user will input one float [salary]
                  The code will return three values [newSalary, moneyEarned, inPercentage]

                  This code will give salary increasean to an employee, and to know how much will the
                  employee get we will use this table
                  |------------------------------------------|
                  |   Salary      |     Readjustment Rate    |
                  |------------------------------------------|
                  |    400<       |            15%           |
                  |    800<       |            12%           |
                  |    1200<      |            10%           |
                  |    2000<      |             7%           |
                  |    2000>      |             4%           |
                  |------------------------------------------|

                  The value of inPercentage will be taken from the table above
                  The value of newSalary will be ( salary + ( salary * inPercentage ) / 100 )
                  The value of moneyEarned will be ( newSalary - salary )

                  The code will output:
                    New salary   : {newSalary}
                    Money earned : {moneyEarned}
                    In percentage: {inPercentage}%

                  *for more inforamtion read the beecrowd description


    Written by  : @TariqJandaly
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem_1 { // public class Main {
    public static void main(String[] args) throws IOException {

        // Getting the input from the user using the Scanner class
        Scanner input = new Scanner(System.in);
        
        // Getting the value [salary] from the Scanner
        System.out.print("~ ");
        Float salary = input.nextFloat();

        // Closing the input Scanner
        input.close();

        // Calculating [newSalary, moneyEarned, inPercentage]

        Integer inPercentage = 0;
        if(salary > 2000) {
            inPercentage = 4;
        } else if(salary <= 400) {
            inPercentage = 15;
        } else if(salary <= 800) {
            inPercentage = 12;
        } else if(salary <= 1200) {
            inPercentage = 10;
        } else if(salary <= 2000) {
            inPercentage = 7;
        }
        Float newSalary = salary + (salary * inPercentage) / 100;
        Float moneyEarned = newSalary - salary;

        // Returning the values [newSalary, moneyEarned, inPercentage]
        System.out.println("New salary   : " + newSalary);
        System.out.println("Money earned : " + moneyEarned);
        System.out.println("In percentage: " + inPercentage + "%");
    }
}