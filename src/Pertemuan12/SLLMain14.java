package Pertemuan12;

// import java.util.Scanner;

// public class SLLMain14 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         SingleLinkedList14 sll = new SingleLinkedList14();

//         System.out.print("Berapa jumlah mahasiswa yang ingin diinput? ");
//         int jumlah = sc.nextInt();
//         sc.nextLine();

//         for (int i = 0; i < jumlah; i++) {
//             System.out.println("Data Mahasiswa ke-" + (i + 1));
//             System.out.print("Masukkan NIM: ");
//             String nim = sc.nextLine();
//             System.out.print("Masukkan Nama: ");
//             String nama = sc.nextLine();
//             System.out.print("Masukkan Kelas: ");
//             String kelas = sc.nextLine();
//             System.out.print("Masukkan IPK: ");
//             double ipk = Double.parseDouble(sc.nextLine());

//             Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);
//             sll.addLast14(mhs);

//             System.out.println();
//         }

//         System.out.println("======== Data Mahasiswa ========");
//         sll.print14();

public class SLLMain14 {
    public static void main(String[] args) {
        SingleLinkedList14 sll = new SingleLinkedList14();

        Mahasiswa14 mhs1 = new Mahasiswa14("23212201", "Bimon", "2B", 3.8);
        Mahasiswa14 mhs2 = new Mahasiswa14("22212202", "Cintia", "3C", 3.5);
        Mahasiswa14 mhs3 = new Mahasiswa14("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa14 mhs4 = new Mahasiswa14("21212203", "Dirga", "4D", 3.6);

        // sll.print14();
        sll.addFirst14(mhs4);
        // sll.print14();
        sll.addLast14(mhs3);
        // sll.print14();
        sll.insertAfter14("Dirga", mhs2);
        sll.insertAt14(2, mhs1);
        // sll.print14();

        System.out.println("data index 1 : ");
        sll.getData14(1);

        System.out.println("data mahasiswa a/n Bimon berada pada index : " + sll.indexOf14("Bimon"));
        System.out.println();

        sll.removeFirst14();
        sll.removeLast14();
        sll.print14();
        sll.removeAt14(0);
        sll.print14();
    }
}