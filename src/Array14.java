import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mataKuliah = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        double[] nilaiAngka = new double[mataKuliah.length];
        int[] bobotSKS = { 2, 2, 2, 3, 2, 2, 3, 2 };

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        System.out.println();

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
        }

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai:");
        System.out.println("======================");
        System.out.println();
        System.out.printf("%-40s %-15s %-15s %-15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalNilaiKali = 0;
        int totalSKS = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf = konversiNilaiHuruf(nilaiAngka[i]);
            double bobotNilai = konversiBobotNilai(nilaiHuruf);

            System.out.printf("%-40s %-15.2f %-15s %-15.2f%n",
                    mataKuliah[i], nilaiAngka[i], nilaiHuruf, bobotNilai);

            totalNilaiKali += (bobotNilai * bobotSKS[i]);
            totalSKS += bobotSKS[i];
        }

        double ipSemester = totalNilaiKali / totalSKS;
        System.out.println("======================");
        System.out.printf("IP = %.2f%n", ipSemester);

        sc.close();
    }

    private static String konversiNilaiHuruf(double nilai) {
        if (nilai >= 80)
            return "A";
        else if (nilai >= 73)
            return "B+";
        else if (nilai >= 65)
            return "B";
        else if (nilai >= 60)
            return "C+";
        else if (nilai >= 50)
            return "C";
        else if (nilai >= 39)
            return "D";
        else
            return "E";
    }

    private static double konversiBobotNilai(String huruf) {
        switch (huruf) {
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }
} 