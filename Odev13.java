import java.util.Scanner;

public class Odev13 {
    public static void main(String[] args) {
        burcHesaplama();
    }

    public static void print(Object text){
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return  in.nextInt();
    }

    public static void burcHesaplama() {
        int month,day;
        print("Ay girin.");
        month = input();
        print("Gün girin");
        day = input();

        if (month == 1) {
            if (day < 22) { print("Oğlak Burcusun.");
            } else { print("Kova Burcusun."); }
        }else if (month == 2) {
            if (day < 20) {print("Kova Burcusun.");
            }else {print("Balık Burcusun.");}
        }else if (month == 3) {
            if (day < 21) {print("Balık Burcusun.");
            }else {print("Koç Burcusun.");}
        }else if (month == 4) {
            if (day < 21) {print("Koç Burcusun.");
            }else {print("Boğa Burcusun.");}
        }else if (month == 5) {
            if (day < 22) {print("Koç Burcusun.");
            }else {print("İkizler Burcusun.");}
        }else if (month == 6) {
            if (day < 23) {print("İkizler Burcusun.");
            }else {print("Yengeç Burcusun.");}
        }else if (month == 7) {
            if (day < 23) {print("Yengeç Burcusun.");
            }else {print("Aslan Burcusun.");}
        }else if (month == 8) {
            if (day < 23) {print("Aslan Burcusun.");
            }else {print("Başak Burcusun.");}
        }else if (month == 9) {
            if (day < 23) {print("Başak Burcusun.");
            }else {print("Terazi Burcusun.");}
        }else if (month == 10) {
            if (day < 23) {print("Terazi Burcusun.");
            }else {print("Akrep Burcusun.");}
        }else if (month == 11) {
            if (day < 22) {print("Akrep Burcusun.");
            }else {print("Yay Burcusun.");}
        }else if (month == 12) {
            if (day < 22) {print("Yay Burcusun.");
            }else {print("Oğlak Burcusun.");}
        }

    }
}
