package Pertemuan11;

public class AntrianKRS14 {
    MahasiswaKRS14[] data;
    int front, rear, size, max, totalDilayani;

    public AntrianKRS14(int max) {
        this.max = max;
        this.data = new MahasiswaKRS14[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalDilayani = 0;
    }

    public boolean isEmpty14() {
        return size == 0;
    }

    public boolean isFull14() {
        return size == max;
    }

    public void clear14() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian14(MahasiswaKRS14 mhs) {
        if (isFull14()) {
            System.out.println("Antrian penuh, tidak bisa menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void panggilAntrian14() {
        if (isEmpty14()) {
            System.out.println("Antrian kosong, tidak ada yang dipanggil.");
            return;
        }
        int jumlahPanggil = Math.min(2, size);
        System.out.println("Memanggil " + jumlahPanggil + " mahasiswa untuk proses KRS:");
        for (int i = 0; i < jumlahPanggil; i++) {
            MahasiswaKRS14 mhs = data[front];
            System.out.print((i + 1) + ". ");
            mhs.tampilkanData14();
            front = (front + 1) % max;
            size--;
            totalDilayani++;
        }
    }

    public void tampilkanSemua14() {
        if (isEmpty14()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData14();
        }
    }

    public void lihatTerdepan14() {
        if (isEmpty14()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            data[front].tampilkanData14();
        }
    }

    public void lihatTerbelakang14() {
        if (isEmpty14()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa paling belakang: ");
            data[rear].tampilkanData14();
        }
    }

    public void lihat2Terdepan14() {
        if (isEmpty14()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("2 Mahasiswa terdepan:");
            int jumlah = Math.min(2, size);
            for (int i = 0; i < jumlah; i++) {
                int idx = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[idx].tampilkanData14();
            }
        }
    }

    public int getJumlahAntrian14() {
        return size;
    }

    public int getTotalDilayani14() {
        return totalDilayani;
    }

    public int getSisaMahasiswa14() {
        return 30 - totalDilayani;
    }
}