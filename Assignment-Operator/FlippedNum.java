import java.util.Scanner;

public class FlippedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num = num1 ^ num2;
        int count = 0;
        while (num > 0) {
            int parity = num % 2;

            if (parity == 1) {
                count++;
            }
            num /= 2;

        }

        System.out.println(count);

        sc.close();
    }
}
