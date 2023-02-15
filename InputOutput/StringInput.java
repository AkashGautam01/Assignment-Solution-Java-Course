import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.next();
        String u = sc.next();
        System.out.print(l + u);
        sc.close();
    }
}
