import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        hipotenusHesapla();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void hipotenusHesapla() {
        int a,b;
        double c;
        print("İlk kenarı girin");
        a = input();
        print("İkinci kenarı girin");
        b = input();
        c = Math.sqrt((a*a)+(b*b));
        print("Hipotenüs = "+c+"cm");
    }
}
