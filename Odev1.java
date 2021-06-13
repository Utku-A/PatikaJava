import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {

        durum();
    }

    public static void print(Object line) {
        System.out.print(line);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static int ortalama() {
        int a,b,c,hesap;
        print("Matematik Notunu Girin ");
        a = input();
        print("Sosyal Notunu Girin ");
        b = input();
        print("Türkçe Notunu Girin ");
        c = input();
        hesap = (a + b + c) / 3 ;
        return hesap;
    }

    public static void durum() {
        int a = ortalama();

        while (a > 60) {
            print("Sınıfı Geçti. ");
            break;
        }
        while (a >= 60) {
            print("Sınıfta Kaldı.");
            break;
        }
    }

}
