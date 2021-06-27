import java.util.Scanner;

public class Odev18 {
    public static void main(String[] args) {
        tekSayiBulanProgram();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void tekSayiBulanProgram() {
        int a,total = 0;

        do {
            print("Sayı girin");
            a = input();
            if (a % 4 == 0) {
                total = a + total;
            }
        } while (a % 2 == 0);
        print("Toplam = "+total);
    }
}
