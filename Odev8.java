import java.util.Scanner;

public class Odev8 {
    public static void main(String[] args) {
        hesapMakinesi();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void hesapMakinesi() {
        int a,b,c;
        Object d;
        print("İlk sayıyı girin");
        a = input();
        print("Yapılaçak işlem\n 1 Toplama\n 2 Çıkartma\n 3 Çarpma\n 4 Bölme");
        b = input();
        print("İkinci sayıyı girin");
        c = input();

        switch (b) {
            case 1 :
                d = a+c;
                break;
            case 2 :
                d = a-c;
                break;
            case 3 :
                d = a*c;
                break;
            case 4 :
                d = a/c;
                break;
            default :
                d = "Hatalı işlem";
                break;
        }

        print("İşlemin sonucu = "+d);
    }
}
