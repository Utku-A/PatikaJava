import java.util.Scanner;

public class Odev34 {

    public static void main(String[] args) {
        select();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void select() {

        print(
                "1. Toplama \n"
                +"2. Çıkartma \n"
                +"3. Çarpma \n"
                +"4. Bölme \n"
                +"5. Üslü sayı hesaplama \n"
                +"6. Faktoriyel hesaplama \n"
                +"7. Mod alma \n"
                +"8. Dikdörtgen alan hesaplama \n"
                +"0. Çıkış \n"
                +"İşlem secin..."
        );
        int selects = input();
        int firsNumber = 0,lastNumber = 0;
        if (selects != 0) {
            print("ilk sayıyı girin.");
            firsNumber = input();
            print("İkinci sayıyı girin");
            lastNumber = input();
        }

        switch (selects){
            case 1:
                add(firsNumber,lastNumber);
                select();
                break;
            case 2:
                extraction(firsNumber,lastNumber);
                select();
                break;
            case 3:
                impact(firsNumber,lastNumber);
                select();
                break;
            case 4:
                chamber(firsNumber,lastNumber);
                select();
                break;
            case 5:
                exponetialNumber(firsNumber,lastNumber);
                select();
                break;
            case 6:
                factorial(firsNumber,lastNumber);
                select();
                break;
            case 7:
                mod(firsNumber,lastNumber);
                select();
                break;
            case 8:
                rectangularArea(firsNumber,lastNumber);
                select();
                break;
            case 0:
                break;
            default:
                print("Hatalı giriş.");
                select();
        }
    }

    public static void add(int a,int b) {
        int result = a + b;
        print("işlem sonucu = "+result);
    }

    public static void extraction(int a,int b) {
        int result = a - b;
        print("işlem sonucu = "+result);
    }

    public static void impact(int a,int b) {
        int result = a * b;
        print("işlem sonucu = "+result);
    }

    public static void chamber(double a,double b) {
        double result = a / b;
        print("işlem sonucu = "+result);
    }

    public static void exponetialNumber(int a,int b) {
        int result;
        if (b == 0) {
            result = 1;
        }else {

            for (int i = 1;i < b;i++){
                a *= a;
            }
            result = a;
        }
        print("işlem sonucu = "+result);
    }

    public static void factorial(int a,int b) {
        int resultA = 1,resultB = 1;
        for (int i = 1; i<= a;i++) {
            resultA *= i;
        }
        for (int i = 1; i<= b;i++) {
            resultB *= i;
        }
        print("İşlem Sonucu "+a+" = "+resultA+" | "+b+" = "+resultB);
    }

    public static void mod(int a,int b) {
        int result = a % b;
        print("işlem sonucu = "+result);
    }
    public static void rectangularArea(int a,int b){
        impact(a,b);
    }
}
