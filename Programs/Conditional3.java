import java.util.Scanner;
public class Conditional3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Value of A : ");
        int A = scanner.nextInt();
        System.out.print("Enter a Value of B : ");
        int B = scanner.nextInt();
        if (A == B) {
            System.out.println("A is equal to B.");  
        } else if (A > B) {
            System.out.println("A is greater than B.");
        } else {
            System.out.println("A is less than B.");
        }
    }
}
