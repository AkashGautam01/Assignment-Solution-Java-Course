import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Enter y : ");
        int y = sc.nextInt();
        System.out.println("------Calculator------");
        System.out.println("Enter opertion:\n 1.Sum\n 2.Subtract\n 3.Multiplication\n 4.Divide");
        System.out.print("Choice : ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Sum is " + (x + y));
                break;
            case 2:
                int diff = x - y;
                int diff2 = y - x;
                System.out.println("Subtaction x-y is " + diff);
                System.out.println("Subtaction y-x is " + diff2);
                break;
            case 3:
                System.out.println("Multiplication is " + (x * y));
                break;
            case 4:
                float div = x / y;
                float div2 = y / x;
                System.out.println("Divide  from x/y is " + div);
                System.out.println("Divide  from y/x is " + div2);
                break;
            default:

                System.out.println("Enter valid choice");
        }
        sc.close();
    }
}
