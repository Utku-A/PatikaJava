import java.util.Scanner;

public class Odev28 {
    public static void main(String[] args) {
        mukemmelSayi();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void mukemmelSayi() {

        print("Sayı girin.");
        int a = input(),toplam = 0;

        for (int i =1;i < a;i++) {
            if (a % i == 0) {toplam += i;}
        }
        if (a == toplam) {print(a+" Mükemmel bir sayıdır.");}
        else {print(a+" Mükemmel bir sayı değildir.");}
    }
}
