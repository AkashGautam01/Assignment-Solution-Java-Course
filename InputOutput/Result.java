import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int mark_1 = sc.nextInt();
        int mark_2 = sc.nextInt();
        int mark_3 = sc.nextInt();
        float sum = (mark_1 + mark_2 + mark_3);
        float per = (sum / 300) * 100;
        System.out.println("Total marks : " + (mark_1 + mark_2 + mark_3));
        System.out.println("Percentage marks : " + per);
        sc.close();
    }
}
