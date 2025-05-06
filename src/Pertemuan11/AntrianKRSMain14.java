package Pertemuan11;

import java.util.Scanner;

public class AntrianKRSMain14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        AntrianKRS14 antrian = new AntrianKRS14(5);

        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil 2 Mahasiswa untuk Proses KRS");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terbelakang");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Cetak Jumlah Antrian");
            System.out.println("8. Cetak Jumlah yang sudah Proses KRS");
            System.out.println("9. Cetak Sisa Mahasiswa yang Belum Proses KRS");
            System.out.println("10. Cek Antrian Kosong");
            System.out.println("11. Cek Antrian Penuh");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc14.nextInt();
            sc14.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc14.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc14.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc14.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc14.nextLine();
                    MahasiswaKRS14 mhs = new MahasiswaKRS14(nim, nama, prodi, kelas);
                    antrian.tambahAntrian14(mhs);
                    break;
                case 2:
                    antrian.panggilAntrian14();
                    break;
                case 3:
                    antrian.tampilkanSemua14();
                    break;
                case 4:
                    antrian.lihat2Terdepan14();
                    break;
                case 5:
                    antrian.lihatTerbelakang14();
                    break;
                case 6:
                    antrian.clear14();
                    break;
                case 7:
                    System.out.println("Jumlah antrian saat ini: " + antrian.getJumlahAntrian14());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + antrian.getTotalDilayani14());
                    break;
                case 9:
                    System.out.println("Sisa mahasiswa yang belum proses KRS: " + antrian.getSisaMahasiswa14());
                    break;
                case 10:
                    if (antrian.isEmpty14()) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println("Ada antrian");
                    }
                    break;
                case 11:
                    if (antrian.isFull14()) {
                        System.out.println("Antrian penuh");
                    } else {
                        System.out.println("Antrian belum penuh");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc14.close();
    }
}