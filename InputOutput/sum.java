import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test cases : ");
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            System.out.println("Enter value of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        }
        sc.close();
    }
}
