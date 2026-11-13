import java.util.Scanner;   
public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        // for(int i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }

        // int i = 0;
        // while(i < 5) {
        //     System.out.println(i);
        //     i++;
        // }

        // int i = 12;
        // while(i < 11) {
        //     System.out.println("Apna College");
        // }

        // do {
        //     System.out.println("SSS");
        // } while(i < 11);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
    
        for(int i = n; i <= 10; i++) {
            System.out.println(i*n);
            
        }
    

    }
}