import java.util.Scanner;

public class Odev23 {
    public static void main(String[] args) {
        harmonik();
    }
    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void harmonik() {
        print("Sayı girin.");
        int a = input();
        double result = 0;

        for (double i = 1;i <= a;i++) {
            result += 1/i;
        }
        print("Sonuç = "+result);
    }
}
