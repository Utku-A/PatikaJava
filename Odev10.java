import java.util.Scanner;

public class Odev10 {
    public static void main(String[] args) {
        SinifGecmeDurumu();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        int sayi = in.nextInt();
        if (sayi > 0 && sayi <= 100) {
            return sayi;
        } else {
            return 0;
        }
    }

    public static void SinifGecmeDurumu() {
        int mat,fizik,turkce,kimya,muzik;
        print("Matematik notunu girin.");
        mat = input();
        print("Fizik notunu girin.");
        fizik = input();
        print("Türkçe notunu girin.");
        turkce = input();
        print("Kimya notunu girin.");
        kimya = input();
        print("Müzik notunu girin.");
        muzik = input();

        int ortalama = (mat+fizik+turkce+kimya+muzik) / 5;

        if (ortalama >= 55) {
            print("Sınıfı geçtiniz");
        } else {print("Kaldınız.");}
        print("Ortalamanız = "+ortalama);
    }
}
