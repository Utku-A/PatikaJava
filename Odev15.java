import java.util.Scanner;

public class Odev15 {
    public static void main(String[] args) {
        zodyagiHesaplama();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void zodyagiHesaplama() {
        print("Doğum tarihinizi girin");
        int a = input();
        int b = a % 12;

        switch (b) {
            case 0:
                print("Maymun");
                break;
            case 1:
                print("Horoz");
                break;
            case 2:
                print("Köpek");
                break;
            case 3:
                print("Domuz");
                break;
            case 4:
                print("Fare");
                break;
            case 5:
                print("Öküz");
                break;
            case 6:
                print("Kaplan");
                break;
            case 7:
                print("Tavşan");
                break;
            case 8:
                print("Ejderha");
                break;
            case 9:
                print("Yılan");
                break;
            case 10:
                print("At");
                break;
            case 11:
                print("Koyun");
                break;
                default: print("Hatalı giriş");
        }
    }

}
