public class Main {
    public static void main(String[] args) {


        int[] dizi={1,2,3,4,5};
        double toplam=0;

        for (int i = 0; i < dizi.length ; i++) {
            toplam+=(1.0/dizi[i]);

        }
        double ort= (dizi.length)/toplam;
        System.out.println("harmonik seri toplam: " +toplam);
        System.out.println("harmonik ortalama: " +ort);
    }
}