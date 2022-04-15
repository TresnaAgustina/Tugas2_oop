import java.util.Scanner;
public class ApkHitungVolBalok {
    public static void main(String[] args) {
//    Membuat object baru dari class HitungVolumeBalok
        HitungVolume volBalok = new HitungVolume();

//        mendefinisikan scanner
        Scanner inputDt = new Scanner(System.in);

//        mengambil inputan nilai panjang dari user
        System.out.print("Masukan Nilai Panjang : ");
        volBalok.pj = inputDt.nextDouble();

//        mengambil inputan nilai lebar dari user
        System.out.print("Masukan Nilai Lebar   : ");
        volBalok.lb = inputDt.nextDouble();

//        mengambil inputan nilai tinggi dari user
        System.out.print("Masukan Nilai Tinggi  : ");
        volBalok.tg = inputDt.nextDouble();
        System.out.println();

//        memanggil method PrintHasil untuk menampilkan hasil
        volBalok.PrintHasil();


    }
}
