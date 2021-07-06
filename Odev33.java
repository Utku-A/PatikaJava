import java.util.Scanner;

public class Odev33 {
    public static void main(String[] args) {
        print("Sayı girin");
        int a = input();
        print(fibonacci(a));
    }

    public static void print(Object text){
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static int fibonacci(int a) {


        if (a == 1 || a == 2){
            return 1;
        }else {
            return fibonacci(a - 1 )+ fibonacci(a - 2);
        }
    }
}
