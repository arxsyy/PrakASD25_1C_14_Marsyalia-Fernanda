import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());
        
        Dosen14[] arrayDosen = new Dosen14[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1) + ":");
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Laki-laki/Perempuan): ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Usia: ");
            int usia = Integer.parseInt(sc.nextLine());

            arrayDosen[i] = new Dosen14(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\nData Dosen:");
        for (Dosen14 dosen : arrayDosen) {
            dosen.tampilkanInfo();
        }

        sc.close();
    }
}