import java.util.Scanner;

public class Odev35 {
    public static void main(String[] args) {

        print("Taban değeri giriniz : ");
        int a = input();
        print("Üs değerini giriniz : ");
        int b = input();

        ustsayiHesaplama(a,b,a);

    }

    public static void print(Object text) {
        System.out.print(text);
    }
    public static void println(Object text) {
        System.out.println(text);
    }
    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void ustsayiHesaplama(int a,int b,int c) {
        int result = a;
        if (b == 0){result = 1;}
        if (b != 1 && b != 0) {
            a *= c;
            b--;
            ustsayiHesaplama(a,b,c);
        }else {
            print("Sonuç : " + result);
        }

    }
}
