import java.util.Scanner;

public class Tugas314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hari = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData mata kuliah ke-" + (i + 1));
            System.out.print("Nama mata kuliah: ");
            namaMatkul[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari: ");
            hari[i] = sc.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n=== Menu Jadwal Kuliah ===");
            System.out.println("1. Tampilkan semua jadwal");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSemuaJadwal(namaMatkul, sks, semester, hari);
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String cariHari = sc.nextLine();
                    tampilkanJadwalHari(namaMatkul, sks, semester, hari, cariHari);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int cariSemester = sc.nextInt();
                    tampilkanJadwalSemester(namaMatkul, sks, semester, hari, cariSemester);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String cariMatkul = sc.nextLine();
                    cariMataKuliah(namaMatkul, sks, semester, hari, cariMatkul);
                    break;
            }
        } while (pilihan != 5);
    }

    static void tampilkanSemuaJadwal(String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(
                    (i + 1) + ". " + nama[i] + " (" + sks[i] + " SKS) - Semester " + semester[i] + " - " + hari[i]);
        }
    }

    static void tampilkanJadwalHari(String[] nama, int[] sks, int[] semester, String[] hari, String cariHari) {
        System.out.println("\nJadwal Kuliah Hari " + cariHari + ":");
        for (int i = 0; i < nama.length; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.println("- " + nama[i] + " (" + sks[i] + " SKS) - Semester " + semester[i]);
            }
        }
    }

    static void tampilkanJadwalSemester(String[] nama, int[] sks, int[] semester, String[] hari, int cariSemester) {
        System.out.println("\nJadwal Kuliah Semester " + cariSemester + ":");
        for (int i = 0; i < nama.length; i++) {
            if (semester[i] == cariSemester) {
                System.out.println("- " + nama[i] + " (" + sks[i] + " SKS) - " + hari[i]);
            }
        }
    }

    static void cariMataKuliah(String[] nama, int[] sks, int[] semester, String[] hari, String cariMatkul) {
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(cariMatkul)) {
                System.out.println("\nInformasi Mata Kuliah:");
                System.out.println("Nama: " + nama[i]);
                System.out.println("SKS: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari: " + hari[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan!");
        }
    }
} 