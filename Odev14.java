import java.util.Scanner;

public class Odev14 {
    public static void main(String[] args) {
        biletHesaplama();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        int sayi = in.nextInt();
        if (sayi <= 0) {return 0;}
        else return sayi;
    }

    public static int bilet() {
        print("Gidiş-dönüş ise 1, Sadece gidiş içinse 2 tuşlayın");
        int bi = input();
        switch (bi) {
            case 1:
                return 80;
            case 2:
                return 100;
            default:
                return 0;
        }
    }

    public static int yas() {
        print("Yaşınızı girin.");
        int ya = input();
        if (ya < 12) {return 50;}
        else if (ya <= 24){return 90;}
        else if (ya >= 65){return 70;}
        else {return 100;}
    }

    public static void biletHesaplama() {
        double km,yas,bilet,tutar;
        yas = yas();
        bilet = bilet();

        print("Km girin.");
        km = input();

        if (yas == 0 || km == 0 || bilet == 0) {print("Hatalı Veri Girdiniz !");}
        else {

            tutar = (((km * 0.10)*yas)/100*bilet)/100;
            print("Bilet tutarı = "+tutar);

        }

    }

}
