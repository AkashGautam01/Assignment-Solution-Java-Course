import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost price : ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling price : ");
        int sp = sc.nextInt();
        if ((sp - cp) > 0) {
            System.out.println("Profit = " + (sp - cp));
        } else if (sp == cp) {
            System.out.println("No Profit , No loss");
        } else {
            System.out.println("Loss = " + (cp - sp));
        }

        sc.close();
    }
}