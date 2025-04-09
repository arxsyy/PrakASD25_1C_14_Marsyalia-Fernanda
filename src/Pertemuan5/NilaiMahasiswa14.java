package Pertemuan5;

public class NilaiMahasiswa14 {
    String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
    double[] nilaiUTS = {78, 85, 90, 76, 92, 95, 82, 84};
    double[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

    double cariNilaiUTSTertinggi(int l, int r) {
        if (l == r) {
            return nilaiUTS[l];
        }
        int mid = (l + r) / 2;
        double leftMax = cariNilaiUTSTertinggi(l, mid);
        double rightMax = cariNilaiUTSTertinggi(mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    double cariNilaiUTSTerendah(int l, int r) {
        if (l == r) {
            return nilaiUTS[l];
        }
        int mid = (l + r) / 2;
        double leftMin = cariNilaiUTSTerendah(l, mid);
        double rightMin = cariNilaiUTSTerendah(mid + 1, r);
        return Math.min(leftMin, rightMin);
    }

    double hitungRataRataUAS() {
        double total = 0;
        for (double uas : nilaiUAS) {
            total += uas;
        }
        return total / nilaiUAS.length;
    }
}