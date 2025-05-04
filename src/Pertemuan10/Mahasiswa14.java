package Pertemuan10;

public class Mahasiswa14 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa14(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai14(int nilai){
        this.nilai = nilai;
    }
}