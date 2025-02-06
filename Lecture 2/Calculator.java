import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
         int ans = 0;
            //take the operator as input
            System.out.print("Enter the Operator: ");
            char op = in.next().trim().charAt(0);
            System.out.println();

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //take two numbers as input
                System.out.print("Enter the two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                System.out.println();
                //input two numbers
                if(op == '+' ) {
                    ans = num1 % num2;
                }
                if(op == '-' ) {
                    ans = num1 - num2;
                }
                if(op == '*' ) {
                    ans = num1 * num2;
                }
                if(op == '/' ) {
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if(op == '%' ) {
                    ans = num1 % num2;
                }
                
            } else if(op == 'x' || op == 'X'){
                break;
            } else {
                System.out.println("Invalid operator. Please enter either +, -, *, /, %, or x.");
            }
                
            System.out.println(ans);
        }
    }
}
