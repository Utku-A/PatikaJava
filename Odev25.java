import java.util.Scanner;

public class Odev25 {
    public static void main(String[] args) {
        start();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int inputInt() {
       Scanner in = new Scanner(System.in);
       return in.nextInt();
    }

    public static String inputString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static void start(){
        int result = 2;
        String users,password;
        while (result >= 0) {
            print("ATM ye hoşgeldiniz.");
            print("Kullanıcı adınızı girin.");
            users = inputString();
            print("Parolayı girin.");
            password = inputString();
            if (users.equals("utku") && password.equals("1234")){
                print("Giriş Başarılı");
                select();
            } else {
                print("Hatalı giriş! "+result+" hakkınız kaldı.");
                result--;
            }
        }
        print("Hesabınız bloke oldu.");
    }

    public static void select(){
        int sel,bakiye = 1000,a;
        while (true) {
            print("");
            print("******İşlem menüsü*****");
            print("1. Bakiye sorma");
            print("2. Para çekme");
            print("3. Para yatırma");
            print("4. Çıkış");
            print("İşlem seçin ...");
            sel = inputInt();
            switch (sel) {
                case 1:
                    print("Bakiyeniz "+bakiye+"Tl dir.");
                    break;
                case 2:
                    print("Çekmek istediğiniz miktarı girin.");
                    a = inputInt();
                    if (bakiye >= a){bakiye -= a;print("Çekme işleminiz gerçekleşti, Mevcut bakiyeniz "+bakiye+"Tl dir");}
                    else {print("Bakiye yetersiz");}
                    break;
                case 3:
                    print("Yatıralaçak tutarı girin");
                    a = inputInt();
                    bakiye += a;
                    print("Yatırma işlemi gerçekleşti, Mevcut bakiyeniz "+bakiye+"Tl dir");
                    break;
                case 4:
                    print("Tekrar bekleriz...");
                    print("");
                    start();
                    break;
                default:
                    print("Hatalı seçim");
            }
        }
    }
}
