import java.util.Scanner;

public class Odev27 {
    public static void main(String[] args) {
        maxMin();
    }

    public static void println(Object text) {
        System.out.println(text);
    }

    public static void print(Object text) {
        System.out.print(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void maxMin() {
        print("Kaç sayı girileçek = ");
        int a = input();
        println("");
        int b,max = 0,min = 0;

        for (int i = 1;i <= a;i++) {
            print(i+". Sayıyı girin = ");
            b = input();
            if (i == 1){max = b; min = b;}
            if (b > max) { max = b; }
            if (b < min) { min = b; }
        }
        println("En büyük sayı = "+max);
        println("En küçük sayı = "+min);
    }

}
