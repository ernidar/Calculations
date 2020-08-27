import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner userInput= new Scanner (System.in);

        System.out.println("Please enter a number: ");
        int firstNumber = userInput.nextInt();

        System.out.println("Please enter another number: ");
        int secondNumber = userInput.nextInt();

        // two ways of getting sum:
        // a. create new variable just for sum
        int sum = firstNumber + secondNumber;
        int product = firstNumber * secondNumber;
        System.out.println("The sum is : " + (firstNumber+secondNumber) );
        System.out.println("The sum is : " + (firstNumber*secondNumber) );

        //b. do the sum in the print statement
        System.out.println("The sum of " +  firstNumber + " and " + secondNumber + " is equal to " + sum);
        System.out.println("The product of " +  firstNumber + " and " + secondNumber + " is equal to " + product);





        // input : two integer inputs from the user (I need the scanner!!)
        // process :
        // 1. Ask user for inputs
        // 2. Sum the two inputs
    }
}
