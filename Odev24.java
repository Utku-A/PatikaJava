import java.util.Scanner;

public class Odev24 {
    public static void main(String[] args) {
        stars();
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

    public static void stars(){
        print("Kaç seri olsun");
        int a = input();

        for (int b =0;b <= a;b++){
            for (int c =b; c < a;c++){print(" ");}
            for (int d =2; d < (b*4);d+=2){print("*");}
            println("");
        }
        for (int b = a-1; (b*a) >= a;b--){
            for (int c =b; c < a;c++){print(" ");}
            for (int d =2; d < (b*4);d+=2){print("*");}
            println("");
        }
    }
}