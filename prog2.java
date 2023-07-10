import java.util.Scanner;
public class prog2 {
    public static void main(String[] args) {
        boolean q = true;
        Scanner sc = new Scanner(System.in);
        while (q) {
            System.out.println("Choose Operation\n1:Add\n2:Subtract\n3:EXIT");
            int ch = sc.nextInt(), a, b;
            switch (ch) {
                case 1:
                    System.out.println("Enter elements to be added:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
                    break;
                case 2:
                    System.out.println("Enter elements to be subtracted:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Difference of " + a + " and " + b + " is " + (a - b));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
            System.out.println("Do you want to continue?Y/N");
            char arg = sc.next().charAt(0);
            if (Character.toLowerCase(arg) == 'n')
                q = false;
        }
    }
}

