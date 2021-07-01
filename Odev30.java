import java.util.Scanner;

public class Odev30 {
    public static void main(String[] args) {
        asalsayiBulma();
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

    public static void asalsayiBulma() {
        print("Kaça kadar bulunsun = ");
        int a = input();
        println("");

        for (int i = 1;i <= a;i++){

            if (i == 2){print(2+" ");}
            if (i == 3){print(3+" ");}
            if (i == 5){print(5+" ");}
            if (i == 7){print(7+" ");}
            if (i % 2 != 0){
                if (i % 3 !=0){
                    if (i % 5 != 0){
                        if (i % 7 != 0){
                            print(i+" ");
                        }
                    }
                }
            }
        }


    }
}
