import java.util.Scanner;

public class String_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        str1 = str1.replace(" ", "");
        String str2 = sc.nextLine();
        str2 = str2.replace(" ", "");
        String str3 = sc.nextLine();
        str3 = str3.replace(" ", "");
        String str4 = sc.nextLine();
        str4 = str4.replace(" ", "");
        System.out.println();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        sc.close();
    }
}
