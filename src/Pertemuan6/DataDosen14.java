package Pertemuan6;

public class DataDosen14 {
    Dosen14[] dataDosen = new Dosen14[10];
    int idx;

    void tambah(Dosen14 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh");
        }
    }

    void tampil() {
        for (Dosen14 d : dataDosen) {
            if (d != null) {
                d.tampilInformasi();
                System.out.println("-------------------------------");
            }
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen14 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia < dataDosen[j + 1].usia) {
                    Dosen14 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    int pencarianDataSequential(String nama) {
        int count = 0;
        int index = -1;

        for (int i = 0; i < idx; i++) {
            if (dataDosen[i] != null && dataDosen[i].nama.equalsIgnoreCase(nama)) {
                count++;
                index = i;
            }
        }

        if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama '" + nama + "'.");
        }

        return index;
    }

    int pencarianDataBinary(int usia) {
        sortingASC();
        int left = 0;
        int right = idx - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == usia) {
                return mid;
            } else if (dataDosen[mid].usia < usia) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}