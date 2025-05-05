package Pertemuan10;

public class StackTugasMahasiswa14 {
    Mahasiswa14[] stack;
    int top;
    int size;

    public StackTugasMahasiswa14(int size){
        this.size = size;
        stack = new Mahasiswa14[size];
        top = -1;
    }

    public boolean isFull14() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty14() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push14(Mahasiswa14 mhs) {
        // if (!isFull14()) {
            top++;
            stack[top] = mhs;
        // } else {
        //     System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        // }
    }

    public Mahasiswa14 pop14() {
        if (!isEmpty14()) {
            Mahasiswa14 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa14 peek14() {
        if (!isEmpty14()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    // public void print14() {
    //     for (int i = 0; i <= top; i++) {
    //         System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
    //     }
    // System.out.println("");
    // }

    public void print14() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
    System.out.println("");
    }

    public Mahasiswa14 peekBottom14() {
        if (!isEmpty14()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public int hitung14() {
        return top+1;
    }

    public String konversiDesimalkeBiner14 (int nilai) {
        StackKonversi14 stack = new StackKonversi14();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push14(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty14()) {
            biner += stack.pop();
        }
        return biner;
    }
}