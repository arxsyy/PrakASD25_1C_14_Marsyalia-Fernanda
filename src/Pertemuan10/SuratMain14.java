package Pertemuan10;

import java.util.Scanner;

public class SuratMain14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        StackSurat14 stack = new StackSurat14(5);
        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Pilih menu : ");
            int pilih = sc14.nextInt();
            sc14.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Id Surat       : ");
                    String idSurat = sc14.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc14.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = sc14.nextLine();
                    System.out.print("Jenis Izin     : ");
                    char izin = sc14.next().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = sc14.nextInt();
                    sc14.nextLine();
                    Surat14 srt = new Surat14(idSurat, nama, kelas, izin, durasi);
                    stack.push14(srt);
                    break;
                case 2:
                    Surat14 verif14 = stack.peek14();
                    if (verif14 != null) {
                        System.out.print("Apakah surat atas nama " + verif14.namaMahasiswa
                                + " akan diproses/verifikasi (Y/N): ");
                        String pilihan = sc14.nextLine();
                        if (pilihan.equalsIgnoreCase("y")) {
                            stack.pop14();
                            System.out.println("Surat atas nama " + verif14.namaMahasiswa + " telah terverifikasi.");
                        } else if (pilihan.equalsIgnoreCase("n")) {
                            System.out.println("Surat atas nama " + verif14.namaMahasiswa + " tidak terverifikasi.");
                        } else {
                            System.out.println("Pilihan salah! Masukkan huruf Y untuk YA dan N untuk NO.");
                        }
                    }
                    break;
                case 3:
                    Surat14 lihat = stack.peek14();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Nama yang dicari: ");
                    String cariNama = sc14.nextLine();
                    stack.SearchingNama14(cariNama);
                    break;
                case 5:
                    System.out.println("Program Selesai.");
                    sc14.close();
                    System.exit(0);
                default:
                    System.out.println("Masukkan pilihan menu yang Benar!");
                    break;
            }
        }
    }
}