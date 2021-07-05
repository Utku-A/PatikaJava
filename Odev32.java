import java.util.Scanner;

class Odev32 {
    public static void main(String[] args) throws Exception {

        Palindrom();

    }

    public static void print(Object text){
        System.out.println(text);
    }

    public static int input(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void Palindrom() {
        int a = input(),reserveNumber = 0,b;
        int c = a;

        while (a != 0) {
            b = a % 10;
            reserveNumber = (reserveNumber * 10) + b;
            a /= 10;
        }
        if (c == reserveNumber){
            print(c+" Bir Polindrom sayıdır.");
        }else {print(c+" Bir Polidrom sayı değildir.");}
    }
}