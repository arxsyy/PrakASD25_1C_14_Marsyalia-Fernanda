package Pertemuan6;

import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen14 dataDosen = new DataDosen14();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia)");
            System.out.println("4. Sorting DSC (Usia)");
            System.out.println("5. Pencarian Data Dosen (Sequential)");
            System.out.println("6. Pencarian Data Dosen (Binary)");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jenis Kelamin (true untuk laki-laki, false untuk perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Masukkan Usia Dosen: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen14 dsn = new Dosen14(kode, nama, jk, usia);
                    dataDosen.tambah(dsn);
                    break;

                case 2:
                    System.out.println("Data Dosen:");
                    dataDosen.tampil();
                    break;

                case 3:
                    System.out.println("Sorting Data Dosen berdasarkan Usia (ASC):");
                    dataDosen.sortingASC();
                    dataDosen.tampil();
                    break;

                case 4:
                    System.out.println("Sorting Data Dosen berdasarkan Usia (DSC):");
                    dataDosen.sortingDSC();
                    dataDosen.tampil();
                    break;

                case 5:
                    System.out.print("Masukkan Nama Dosen yang dicari: ");
                    String namaCari = sc.nextLine();
                    int posisi = dataDosen.pencarianDataSequential(namaCari);
                    if (posisi != -1) {
                        System.out.println("Dosen ditemukan di indeks: " + posisi);
                    } else {
                        System.out.println("Dosen tidak ditemukan.");
                    }
                    break;

                case 6:
                    System.out.print("Masukkan Usia Dosen yang dicari: ");
                    int usiaCari = sc.nextInt();
                    int posisiBinary = dataDosen.pencarianDataBinary(usiaCari);
                    if (posisiBinary != -1) {
                        System.out.println("Dosen ditemukan di indeks: " + posisiBinary);
                    } else {
                        System.out.println("Dosen tidak ditemukan.");
                    }
                    break;

                case 7:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}