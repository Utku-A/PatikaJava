import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        vicutKitleEndeksi();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static double input() {
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }

    public static void vicutKitleEndeksi() {
        double a,b,c;
        print("Boyunuzu Giriniz (Metre cinsinden virgül kullanarak)");
        a = input();
        print("Kilonuzu Giriniz (Virgül kullanarak)");
        b = input();
        c = a / b * b;
        print("Vicut Kitle İndeksiniz "+c+" dir");
    }
}
