import java.util.Scanner;

public class Odev17 {
    public static void main(String[] args) {
        sayiBulma();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void sayiBulma() {
        print("Sayı girin.");
        int a = input();

        for (int i = 0; i <= a;i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                print(i);

            }
        }
    }

}


