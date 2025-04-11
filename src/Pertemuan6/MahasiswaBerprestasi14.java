package Pertemuan6;

public class MahasiswaBerprestasi14 {
    Mahasiswa14[] listMhs = new Mahasiswa14[5];
    int idx;

    void tambah(Mahasiswa14 m) {
        if (m != null && idx < listMhs.length) {
            listMhs[idx++] = m;
        } else {
            System.out.println(m == null ? "Objek Mahasiswa tidak boleh null." : "Data sudah penuh.");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            if (listMhs[i] != null) {
            }
        }
        System.out.println("-------------------------------");
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j] != null && listMhs[j + 1] != null && listMhs[j + 1].ipk > listMhs[j].ipk) {
                    Mahasiswa14 tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }
}