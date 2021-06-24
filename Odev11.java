import java.util.Scanner;

public class Odev11 {
    public static void main(String[] args) {
        EtkinlikPlanlama();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void EtkinlikPlanlama() {
        print("Hava sıcaklığını girin.");
        int heat = input();

        if (heat < 5) {
            print("Kayak yapabilirsin.");
        }
        if (heat >= 5 && heat <= 15) {
            print("Sinemaya gidebilirsin.");
        }
        if (heat >= 10 && heat <=25) {
            print("Piknik yapabilirsin.");
        }
        if (heat > 25) {
            print("Yüzebilirsin.");
        }
    }
}
