import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q1. Find the largest number
      /*   int max = a;
        if(b> max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println("The largest number is: " + max); */
        

        int max = Math.max(c, Math.max(a,b));
        System.out.println("The largest number is: " + max);
   
    }
}
