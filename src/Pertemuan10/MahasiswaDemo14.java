package Pertemuan10;

import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        StackTugasMahasiswa14 stack = new StackTugasMahasiswa14(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Menghitung Jumlah Tugas yang sudah dikumpulkan");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa14 mhs = new Mahasiswa14(nama, nim, kelas);
                    stack.push14(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa14 dinilai = stack.pop14();
                    if (dinilai !=null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100) : ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai14(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalkeBiner14(nilai);
                        System.out.println("Nilai Biner Tugas:" + biner);
                    }
                    break;
                case 3:
                    Mahasiswa14 lihat = stack.peek14();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print14();
                    break;
                case 5:
                    Mahasiswa14 terbawah = stack.peekBottom14();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + terbawah.nama);
                    }
                    break;
                case 6:
                    int jumlahTugas = stack.hitung14();
                    System.out.printf("Jumlah tugas yang sudah dikumpulkan : %d\n", jumlahTugas);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih >= 1 && pilih <=4);

        scan.close();
    }
}