package Pertemuan12;

import java.util.Scanner;

public class SLLMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList14 sll = new SingleLinkedList14();

        System.out.print("Berapa jumlah mahasiswa yang ingin diinput? ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);
            sll.addLast14(mhs);

            System.out.println();
        }

        System.out.println("======== Data Mahasiswa ========");
        sll.print14();
    }
}