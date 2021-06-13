import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        daireHesap();
    }

    public static void print (Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void daireHesap() {
        int r;
        double formul,pi;
        pi = 3.14;
        print("Yarı çapı girin.");
        r = input();
        formul = (pi * (r*r) * pi) / 360;
        print("Dairenin diliminin alanı = "+formul);
    }
}
