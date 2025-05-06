package Pertemuan11;

public class MahasiswaKRS14 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public MahasiswaKRS14(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData14() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}