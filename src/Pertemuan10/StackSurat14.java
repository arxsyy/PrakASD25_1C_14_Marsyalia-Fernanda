package Pertemuan10;

public class StackSurat14 {
    Surat14[] stack;
    int size;
    int top;

    StackSurat14(int size) {
        this.size = size;
        stack = new Surat14[size];
        top = -1;
    }

    boolean isFull14() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty14() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push14(Surat14 srt) {
        if (!isFull14()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah surat.");
        }
    }

    Surat14 pop14() {
        if (!isEmpty14()) {
            Surat14 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk dilakukan verifikasi.");
            return null;
        }
    }

    Surat14 peek14() {
        if (!isEmpty14()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    void print14() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" + stack[i].jenisIzin + "\t" + stack[i].durasi);
        }
        System.out.println("");
    }

    void SearchingNama14(String nama) {
        if (!isEmpty14()) {
            boolean found = false;
            for (int i = top; i >= 0; i--) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    System.out.println("Surat dengan nama " + stack[i].namaMahasiswa + " ditemukan.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Surat dengan nama " + nama + " tidak ada.");
            }
        } else {
            System.out.println("Stack Kosong! Tidak ada surat.");
        }
    }
}