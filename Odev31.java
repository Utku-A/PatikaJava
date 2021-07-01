import java.util.Scanner;

public class Odev31 {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void print(Object text){
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void fibonacci() {
        print("Kaçseri olsun");
        int a = input(),b = 0,c = 1;

        for (int i = 1;i < (a/2+1);i++){
            if (b == 0){print(0);print(1);}
            b += c;
            print(b);
            c += b;
            print(c);
        }
    }
}
