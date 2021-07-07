import java.util.Scanner;

public class Odev36 {
    public static void main(String[] args) {

        print("Sayı Giriniz : ");
        int a = input();
        asalsayiBulma(a,1,0);

    }

    public static void print(Object text) {
        System.out.print(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void asalsayiBulma(int a,int sayac,int deneme) {

        if (sayac <= a){

            if (a % sayac == 0){
                deneme++;
            }
            sayac++;
            asalsayiBulma(a,sayac,deneme);
        }
        if (deneme == 1 && a == sayac){
            print(a+" sayısı Asaldır");
        }else if (deneme != 1 && a == sayac) {
            print(a+" sayısı Asal değildir !");
        }
    }
}
