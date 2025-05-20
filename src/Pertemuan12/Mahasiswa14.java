package Pertemuan12;

public class Mahasiswa14 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa14(String nm, String name, String kelas, double ipk) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi14() {
        System.out.printf("%-10s %-10s %-5s %-4.1f\n", nama, nim, kelas, ipk);
    }
}