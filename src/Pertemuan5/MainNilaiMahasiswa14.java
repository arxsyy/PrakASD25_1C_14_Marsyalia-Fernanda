package Pertemuan5;

public class MainNilaiMahasiswa14 {
    public static void main(String[] args) {
        NilaiMahasiswa14 nm = new NilaiMahasiswa14();

        double nilaiUTSTertinggi = nm.cariNilaiUTSTertinggi(0, nm.nilaiUTS.length - 1);
        System.out.println("Nilai UTS tertinggi: " + nilaiUTSTertinggi);

        double nilaiUTSTerendah = nm.cariNilaiUTSTerendah(0, nm.nilaiUTS.length - 1);
        System.out.println("Nilai UTS terendah: " + nilaiUTSTerendah);

        double rataRataUAS = nm.hitungRataRataUAS();
        System.out.println("Rata-rata nilai UAS: " + rataRataUAS);
    }
}