import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {

        hesaplama();

    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static void hesaplama() {
        int a,hesap,kdv;
        print("Para Tutarını Girin.");
        a = input();
        if (a < 1000) {
            hesap = (a * 118) / 100;
            kdv = hesap - a;
            print("KDV'siz = "+a+" KDV'li = "+hesap+" KDV = "+kdv);
        }
        if (a >= 1000) {
            hesap = (a * 108) / 100;
            kdv = hesap - a;
            print("KDV'siz = "+a+" KDV'li = "+hesap+" KDV = "+kdv);
        }

    }
}
