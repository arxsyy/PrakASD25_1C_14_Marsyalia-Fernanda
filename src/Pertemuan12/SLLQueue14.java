package Pertemuan12;

import java.util.Scanner;

public class SLLQueue14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        QueueLL14 queue = new QueueLL14();
        int pilih;

        do {
            System.out.println("=== Menu Antrian Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa dari Antrian");
            System.out.println("3. Tampilkan Antrian Terdepan");
            System.out.println("4. Tampilkan Antrian Paling Akhir");
            System.out.println("5. Tampilkan Jumlah Mahasiswa yang Masih Mengantre");
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih opsi (1-8): ");
            pilih = sc14.nextInt();
            sc14.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = sc14.nextLine();
                    queue.insert14(nama);
                    System.out.println("Mahasiswa " + nama + " telah ditambahkan ke antrian.");
                    break;
                case 2:
                    System.out.println("Memanggil: " + queue.call14());
                    break;
                case 3:
                    System.out.println("Antrian terdepan: " + queue.peekFront14());
                    break;
                case 4:
                    System.out.println("Antrian paling akhir: " + queue.peekRear14());
                    break;
                case 5:
                    System.out.println("Jumlah mahasiswa yang masih mengantre: " + queue.getSize14());
                    break;
                case 6:
                    System.out.println("Isi Antrian: ");
                    queue.displayQueue14();
                    break;
                case 7:
                    queue.clear();
                    System.out.println("Antrian telah dikosongkan.");
                    break;
                case 8:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        } while (pilih != 8);

        sc14.close();
    }
}