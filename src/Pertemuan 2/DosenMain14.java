public class DosenMain14 {
    public static void main(String[] args) {

        Dosen14 dsn1 = new Dosen14();
        dsn1.idDosen = "DSN001";
        dsn1.nama = "Dr. Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Kecerdasan Buatan";

        System.out.println("=== Informasi Dosen 1 ===");
        dsn1.tampilInformasi();

        dsn1.setStatusAktif(false);
        
        int masaKerja1 = dsn1.hitungMasaKerja(2024);
        System.out.println("Masa kerja " + dsn1.nama + ": " + masaKerja1 + " tahun");

        dsn1.ubahKeahlian("Machine Learning");

        System.out.println("\n=== Informasi Dosen 1 Setelah Diubah ===");
        dsn1.tampilInformasi();

        Dosen14 dsn2 = new Dosen14("DSN002", "Prof. Siti Aminah", true, 2015, "Data Science");
        
        System.out.println("=== Informasi Dosen 2 ===");
        dsn2.tampilInformasi();

        int masaKerja2 = dsn2.hitungMasaKerja(2024);
        System.out.println("Masa kerja " + dsn2.nama + ": " + masaKerja2 + " tahun");

        dsn2.ubahKeahlian("Big Data Analytics");
        dsn2.setStatusAktif(true);

        System.out.println("\n=== Informasi Dosen 2 Setelah Diubah ===");
        dsn2.tampilInformasi();
    }
}
