package Pertemuan11;

public class AntrianLayanan14 {
    Mahasiswa14[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan14(int max) {
        this.max = max;
        this.data = new Mahasiswa14[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty14() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull14() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    
    public void lihatTerdepan14() {
        if (isEmpty14()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData14();
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
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData14();
        }
    }

    public int getJumlahAntrian14() {
        return size;
    }
    

    public void clear14() {
        if (!isEmpty14()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian14(Mahasiswa14 mhs) {
        if (isFull14()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }   

    public Mahasiswa14 layaniMahasiswa14() {
        if (isEmpty14()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa14 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

}