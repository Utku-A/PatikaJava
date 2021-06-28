import java.util.Scanner;

public class Odev21 {
    public static void main(String[] args) {
        uslusayiBulma();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void uslusayiBulma() {
        int a,b,c = 1;
        print("Sayıyı girin.");
        a = input();
        print("Üstü girin.");
        b = input();

        for (int i = 1;i <= b;i++) {
            c *= a ;
        }
        print("Sonuç = "+c);

    }
}
