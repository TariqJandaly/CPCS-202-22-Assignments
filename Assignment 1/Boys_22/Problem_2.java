package Boys_22;
/*
    Problem Name: Salary with Bonus
    Assignment  : 0001
    Problem     : 1009
    Beecrowd    : https://www.beecrowd.com.br/judge/en/problems/view/1009
    Group       : Boys - 22
    Description : The user will input 4 numbers [name, salary, sales]
                  The code will return 1 output [newSalary, bounes]

                  After receving the salary and sales from the user
                  bounes will be calculated as: sales * 0.15
                  newSalary will be calculated as: salary + bounes

                  The code will then return the value of newSalary

                  *for more inforamtion read the beecrowd description

                  
    Written by  : @TariqJandaly
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem_2 { // public class Main {
    public static void main(String[] args) throws IOException {
        
        // Getting the input from the user using the Scanner class
        Scanner input = new Scanner(System.in);

        // Getting the values [name, salary, sales] from the Scanner
        System.out.print("~ ");
        String name = input.next();
        Integer salary = input.nextInt();
        Integer sales = input.nextInt();

        // Closing the input Scanner
        input.close();

        // Calualting [newSalary, bounes]
        Float bounes = sales * 0.15f;
        Float newSalary = salary + bounes;

        // Returning the values of [newSalary, bounes] to the user
        System.out.println("Name: " + name);
        System.out.println("TOTAL: " + newSalary + " S.R");
    }    
}