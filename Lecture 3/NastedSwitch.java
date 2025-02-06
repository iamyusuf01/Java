import java.util.Scanner;

public class NastedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();

        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Md Ahmad");
                break;
            case 2:
                System.out.println("Md Rizwan");
                break;
            case 3:
                System.out.println("Mr. Khan");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Department":
                        System.out.println("Management");
                        break;
                    default:
                        System.out.println("No Department available");
                }
                break;
            default:
                System.out.println("No Employee available");
        }
    }
}
