import java.util.Scanner;

public class Odev37 {
    public static void main(String[] args) {
        print("Sayı girin : ");
        int a = input();

        deseneGoreMetot(a,1);
    }

    public static void print(Object text) {
        System.out.print(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void deseneGoreMetot(int a,int b) {
        if (a >= 0 || a != -a) {
            a -= 5;
            print(a+" ");
        }
        if (a == 0 || a < 0) {
            a +=5;
            print(a+" ");
        }
        if (b < 10){
            b++;
            deseneGoreMetot(a,b);
        }
    }
}
