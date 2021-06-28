import java.util.Scanner;

public class Odev22 {
    public static void main(String[] args) {
        rakammlarinToplami();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void rakammlarinToplami() {
        print("Sayı girin.");
        int a,toplamRakkam = 0,sayaç = 0,b,c;
        a = input();
        b = a;
        while (b != 0) {
            b = b / 10;
            sayaç++;
        }
        print(sayaç);
        for (int i =0; i < sayaç;i++) {
            toplamRakkam += a % 10;
            a = a /10;

        }
        print("Rakkamlar toplamı = "+toplamRakkam);
    }
}
