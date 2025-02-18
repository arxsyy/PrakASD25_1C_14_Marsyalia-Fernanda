import java.util.Scanner;

public class Tugas214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        double sisi;

        do {
            System.out.println("\n=== Program Perhitungan Kubus ===");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.nextInt();

            if (pilihan != 4) {
                System.out.print("Masukkan panjang sisi kubus: ");
                sisi = sc.nextDouble();

                switch (pilihan) {
                    case 1:
                        hitungVolume(sisi);
                        break;
                    case 2:
                        hitungLuasPermukaan(sisi);
                        break;
                    case 3:
                        hitungKeliling(sisi);
                        break;
                }
            }
        } while (pilihan != 4);
    }

    static void hitungVolume(double sisi) {
        double volume = Math.pow(sisi, 3);
        System.out.println("Volume kubus = " + volume);
    }

    static void hitungLuasPermukaan(double sisi) {
        double luasPermukaan = 6 * Math.pow(sisi, 2);
        System.out.println("Luas permukaan kubus = " + luasPermukaan);
    }

    static void hitungKeliling(double sisi) {
        double keliling = 12 * sisi;
        System.out.println("Keliling kubus = " + keliling);
    }
}
