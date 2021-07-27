public class Odev39 {
    public static void main(String[] args) {
        int[] arr = {1,6,7,8,1,8,9,4,5};
        harmonikOrtalama(arr);
    }

    static void print(Object text) {
        System.out.println(text);
    }

    static int elemanSayisi(int[] arr) {
        int length = 0;
        for(int i=0;i < arr.length;i++) {
            length++;
        }
        return length;
    }

    static void harmonikOrtalama(int[] arr) {
        int n = elemanSayisi(arr);
        double sum = 0;
        for (int i=0;i < arr.length;i++){
            sum += (1/arr[i]);
        }
        print("Harmonik ortalama = "+n/sum);
    }
}
