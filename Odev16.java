import java.util.Scanner;

public class Odev16 {
    public static void main(String[] args) {
        artikYilHesaplama();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void artikYilHesaplama() {
        print("Yıl girin.");
        int a = input();
        int b = a % 4;
        if (b == 0) {
            print(a+" Artık bir yıldır.");
        }else {print(a+" Artık bir yıl değildir.");}
    }
}
