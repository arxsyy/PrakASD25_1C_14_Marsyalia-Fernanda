package Pertemuan6;

import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14();
        int jumMhs=5;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama: ");
            String name = sc.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kls = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa14 m = new Mahasiswa14(nim, name, kls, ipk);
            list.tambah(m);
            System.out.println("-------------------------------");
        }

        list.bubbleSort();

        // System.out.println("---------------------------------------------------");
        // System.out.println("Pencarian data");
        // System.out.println("---------------------------------------------------");
        // System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        // double cari = sc.nextDouble();
        // System.out.println("Menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        // Melakukan pencarian data Binary
        System.out.println("---------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------------------");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = sc.nextDouble();
        System.out.println("---------------------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("---------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}