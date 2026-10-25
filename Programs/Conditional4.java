import java.util.Scanner;
public class Conditional4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int button = scanner.nextInt();
        switch (button) {
            case 1: 
                System.out.println("You entered One.");
                break;
            case 2:
                System.out.println("You entered Two.");
                break;
            case 3:
                System.out.println("You entered Three.");
                break;
            default:
                System.out.println("You entered a number other than One, Two, or Three.");
        }
    }
}
