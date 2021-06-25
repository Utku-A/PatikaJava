import java.util.Scanner;

public class Odev12 {
    public static void main(String[] args) {
        siralama();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void siralama() {
        int a,b,c;
        print("İlk sayıyı girin.");
        a = input();
        print("İkinci sayıyı girin.");
        b = input();
        print("Üçünçü sayıyı girin.");
        c = input();

        if (a < b && a < c) {
            if (b < c) {
                print(a+" < "+b+" < "+c);
            }else {
                print(a+" < "+c+" < "+b);
            }
        }else if (b < a && b < c) {
            if (a < c) {
                print(b+" < "+a+" < "+c);
            }else {
                print(b+" < "+c+" < "+a);
            }
        }else if (c < a && c < b) {
            if (a < b) {
                print(c+" < "+a+" < "+b);
            }else {
                print(c+" < "+b+" < "+a);
            }
        }
    }
}
