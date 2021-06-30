import java.util.Scanner;

public class Odev26 {
    public static void main(String[] args) {
        ekok();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void ekok() {
        print("İlk büyük olan sayıyı girin.");
        int a = input();
        print("ikinci küçük olan sayıyı girin.");
        int b = input();
        int i = 1;
        int ebob = 1;
        while (i<=b){
            if (a % i == 0 && b % i == 0){
                ebob = i;
            }
            i++;
        }
        print("Ebob = "+ebob);
        print("Ekok = "+ (a*b)/ebob);
    }
}
