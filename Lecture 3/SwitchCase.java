

import java.util.Scanner;


public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // String fruit =  in.next();

        // switch (fruit) {
            
        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("A sweet red fruits");
        //         break;
        //     case "Orange":
        //          System.out.println("An orange fruit");
        //          break;
        //     case "Grape":
        //          System.out.println("A ripe fruit");
        //          break;
        //     default:
        //         System.out.println("Please Enter a valid fruits");
        //         break;
        // }

        int day = in.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

    }
}
