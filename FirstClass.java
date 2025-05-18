import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {

        System.out.println("calc function ");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = input.nextInt();

        System.out.println("Choise operator like - + , - , × , / ");
        String opt = input.next();

        System.out.print("Enter Second Number : ");
        int num2 = input.nextInt();

         int sum = calc(num1,num2,opt);

        System.out.println("============================");

        System.out.print("Total value is : "+ sum);
    }

    public static int  calc (int a, int b ,String c){


        if(c.equals("+")){
            return  a+ b;
        }
        else if(c.equals("-")){
            return  a - b;
        }
        else if(c.equals("*")){
            return  a * b;
        }
        else if(c.equals("/")){
            return  a / b;
        }
        else {
            return 0;
        }

    }



}
