package Pertemuan10;

public class StackKonversi14 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi14() {
        this.size = 32; //asumsi 32 bit
        tumpukanBiner = new int[size];
        top = -1;
    }
    public boolean isEmpty14(){
        return top == -1;
    }

    public boolean isFull14() {
        return top == size -1;
    }
    public void push14(int data) {
        if (isFull14()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }
    public int pop() {
        if (isEmpty14()) {
            System.out.println("Stack kosong");
            return -1;
        } else{
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
    
}

