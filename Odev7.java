import java.util.Scanner;

public class Odev7 {
    public static void main(String[] args) {
        manavProgrami();
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static void manavProgrami() {
        double armut,elma,domates,muz,patlican,toplam;
        double armutDe,elmaDe,domatesDe,muzDe,patlicanDe;
        armutDe = 2.14;
        elmaDe = 3.67;
        domatesDe = 1.11;
        muzDe = 0.95;
        patlicanDe = 5.0;

        print("Armut kaç kg ?");
        armut = input() * armutDe;
        print("Elma kaç kg ?");
        elma = input() * elmaDe;
        print("Domates kaç kg ?");
        domates = input() * domatesDe;
        print("Muz kaç kg ?");
        muz = input() * muzDe;
        print("Patlıcan kaç kg ?");
        patlican = input() * patlicanDe;
        toplam = armut+elma+domates+muz+patlican;
        print("-------------------------------");
        print("Toplam Tutar : "+toplam);
    }
}
