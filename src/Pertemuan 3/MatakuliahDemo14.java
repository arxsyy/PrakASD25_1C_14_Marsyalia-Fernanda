import java.util.Scanner;
public class MatakuliahDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int jumlahMatakuliah = Integer.parseInt(sc.nextLine());
        System.out.println();
        Matakuliah14[] arrayOfMatakuliah14 = new Matakuliah14[jumlahMatakuliah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode      : ");
            kode = sc.nextLine();
            System.out.print("Nama      : ");
            nama = sc.nextLine();
            System.out.print("SKS       : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------");

            arrayOfMatakuliah14[i] = new Matakuliah14(kode, nama, sks, jumlahJam);
            arrayOfMatakuliah14[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah14[i].cetakInfo();
        }
        
    }
}
