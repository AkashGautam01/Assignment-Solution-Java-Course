
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        float num = sc.nextFloat();
        System.out.println("Cube of " + num + " is " + num * num * num);
        // System.out.println("Size of bool is "+ );
        sc.close();
    }
}
