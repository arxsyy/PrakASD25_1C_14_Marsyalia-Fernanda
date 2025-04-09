public class Fungsi14 {
    public static void main(String[] args) {
        int[][] stockBunga = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };

        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = (stockBunga[i][0] * hargaAglonema) +
                    (stockBunga[i][1] * hargaKeladi) +
                    (stockBunga[i][2] * hargaAlocasia) +
                    (stockBunga[i][3] * hargaMawar);
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }

        System.out.println("\nStock bunga di RoyalGarden 4:");
        System.out.println("Aglonema: " + (stockBunga[3][0] - 1) + " (berkurang 1)");
        System.out.println("Keladi: " + (stockBunga[3][1] - 2) + " (berkurang 2)");
        System.out.println("Alocasia: " + (stockBunga[3][2] - 0) + " (berkurang 0)");
        System.out.println("Mawar: " + (stockBunga[3][3] - 5) + " (berkurang 5)");
    }
} 