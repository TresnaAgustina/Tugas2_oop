public class HitungVolume {

    double pj;
    double lb;
    double tg;
    double hasil;

//membuat construktor
    public HitungVolume(){
        System.out.println();
        System.out.println("====================================");
        System.out.println("Ini Aplikasi Penghitung Volume Balok");
        System.out.println("====================================");
        System.out.println();
    }


    //    method untuk mengambil nilai panjang
    private double getPj(double Pj) {
        Pj = this.pj;

        return Pj;
    }

    //    method untuk mengambil nilai lebar
    private void getLb(double Lb) {

        Lb = this.lb;
    }

    //    method untuk mengambil nilai tinggi
    private void getTg(double Tg) {

        Tg = this.tg;
    }


//    method untuk melakukan perhitungan volume balok
    private double HitungvolBalok(){
        hasil = pj * lb * tg;

        return hasil;
    }


//    method untuk menampung hasil yang akan ditampilkan
    public void PrintHasil(){
        this.HitungvolBalok();


        System.out.println("Panjang Balok   : " + this.pj);
        System.out.println("Lebar Balok     : " + this.lb);
        System.out.println("Tinggi Balok    : " + this.tg);
        System.out.println("Hasilnya adalah : " + String.format("%.2f", this.hasil));
    }


}
