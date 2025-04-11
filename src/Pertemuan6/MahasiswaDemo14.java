package Pertemuan6;


import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14();
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa14 m = new Mahasiswa14(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
    }
}