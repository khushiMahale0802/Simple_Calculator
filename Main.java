import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");

        while (true) {
            double num1 = 0, num2 = 0;
            String Operation;

            //Input first number
            System.out.print("Enter the first number: ");
            try{
                num1 = Double.parseDouble(scanner.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Invalid input ! Please enter a valid number :");
                continue;
            }
            System.out.print("Enter the second number: ");
            try{
                num2 = Double.parseDouble(scanner.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Invalid input ! Please enter a valid number :");
                continue;
            }

            //select operation 

            System.out.print("Select an operation (+ ,- ,* ,/): ");
            Operation= scanner.nextLine();

            double result=0;
            boolean validOperation= true;

            switch (Operation) {
                case "+":
                    result=add(num1,num2);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    break;
                case "*":
                    result=multiply(num1,num2);
                    break;
                case "/":
                    if(num2==0){
                        System.out.println("Error Division by Zero is not allowed..");
                        validOperation= false;
                    }else{
                        result=divide(num1,num2);
                    }
                    break;
                default:
                    System.out.println("Invalid operation! Please select a valid operation (+,-,*,/).");
                    validOperation=false;
                   
            }

            if(validOperation){
                System.out.printf("The result of %f is: %f\n", num1, Operation,num2,result);
            }

            System.out.print("Do you want to perform another calculation?(yes/no):");
            String continueCalculation = scanner.nextLine().trim().toLowerCase();
            if(!continueCalculation.equals("yes")){
                break;
            }
        }
        scanner.close();
        System.out.println("Thank you for using the Console-based Calculator!");
    }


    //addition
    public static double add(double a, double b){
        return a + b;
    }

    //subtraction
    public static double subtract(double a, double b){
        return a-b;
    }

    //multiplication
    public static double multiply(double a, double b){
        return a*b;
    }

    //division
    public static double divide(double a, double b){
        return a/b;
    }

}