import java.util.Scanner;

public class Odev9 {

    public static void main(String[] args) {

        loginSystem();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static String input() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    public static void loginSystem() {
        String Try,Username,Password,Update,InUsername,InPassword;

        Username = "UTKU";
        Password = "1234";

        while (true) {
            print("Kullanıcı adını girin");
            InUsername = input();
            print("Şifreyi girin");
            InPassword = input();
            if (InUsername.equals(Username) && InPassword.equals(Password)) {
                print("Giriş Başarılı");
                break;
            }else {
                print("Giriş hatalı! Şifreyi sıfırlmaka için 1 Tekrar denemek için bir tuşa basın.");
                Try = input();
                if (Try.equals("1")){
                    print("Yeni şifreyin girin");
                    Update = input();
                    if (Update.equals(Password)) {
                        print("Eski şifre ile aynısı olamaz.. Girişe Yönlendiriliyor..");
                        loginSystem();
                    } else {
                        Password = Update;
                        print("Yeni şifre oluşturuldu = "+Password);
                    }
                }
            }
        }

    }
}
