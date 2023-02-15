import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int n = Integer.parseInt(String.valueOf(num.charAt(0))) + Integer.parseInt(String.valueOf(num.charAt(1)))
                + Integer.parseInt(String.valueOf(num.charAt(2)));
        System.out.println(n);
        sc.close();
    }
}
