import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length : ");
        int x = sc.nextInt();
        System.out.println("Enter Breadth : ");
        int y = sc.nextInt();
        if (x == y) {
            System.out.println("It is a Square.");
        } else {
            System.out.println("It is a Rectangle.");

        }
        sc.close();
    }
}