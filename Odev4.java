import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        taksiTarifeHesaplama();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void taksiTarifeHesaplama() {
        int a;
        double b,c;
        print("KM Girin");
        a = input();
        b = (a * 2.2) + 10;
        if (b <= 20) {
            c = 20.0;
        } else {
            c = b;
        }
        print("Tutar = "+c);
    }
}
