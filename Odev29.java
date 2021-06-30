import java.util.Scanner;

public class Odev29 {
    public static void main(String[] args) {
        stars();
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

    public static void stars() {
        print("Kaç seri olsun = ");
        int a = input();
        println("");
        for (int b = a; (b*a) >= a;b--){
            for (int c =b; c < a;c++){print(" ");}
            for (int d =2; d < (b*4);d+=2){print("*");}
            println("");
        }

    }
}
