import java.util.Scanner;

public class Odev20 {
    public static void main(String[] args) {
        kombinasyon();
    }
    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void kombinasyon() {
        int a,b = 1,c,d = 1,e,f = 1,hesap;

        print("Eleman Sayısını girin.");
        a = input();
        for (int i = 1; i <= a; i++){
            b *= i;
        }
        print("Seçim sayısını girin.");
        c = input();
        for (int i = 1; i <= c; i++){
            d *= i;
        }

        e = a - c;

        for (int i = 1; i <= e; i++){
            f *= i;
        }

        hesap = b / (d * f);

        print("Sonuç = "+hesap);
    }
}
