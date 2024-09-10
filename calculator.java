import java.util.Scanner;

class calculator {
    public static void main(String[]args){

        int n1,n2,operator;

        System.out.println("1-Add\n 2-Subtract\n 3- Multiply\n 4-Divide");
        System.out.println("Choose Operator:");

//input from scanner

        Scanner sc=new Scanner(System.in);
        operator=sc.nextInt();

// input first number 

        System.out.print("Enter first number:");
        n1=sc.nextInt();

// inout second number

        System.out.print("Enter Second number:");
        n2=sc.nextInt();


        int result=0;

// Switch case

        switch (operator){


            case 1:
              result=n1 + n2;
              break;



            case 2:
                result=n1 - n2;
                break;



            case 3:
                result=n1 * n2;
                break;



            case 4:
                result=n1 / n2;
                break;



            default:
                System.out.println("Entered Operator is not valid");
        }


        System.out.println("Result is: " +result);
    }

}