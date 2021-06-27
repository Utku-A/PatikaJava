import java.util.Scanner;

public class Odev19 {
    public static void main(String[] args) {
        kuvvet();
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static void kuvvet() {
        print("Sayı girin");
        int b,c,d;
        b = input();
        c = 1;
        d = 1;
        while (d < b) {
            print(c);
            c *= 4;
            print(c);
            print(d);
            d *= 5;

        }
    }
}
