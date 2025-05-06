package Pertemuan11;

public class Queue14 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue14(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
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
    
    public void peek14() {
        if (!isEmpty14()) {
            System.out.println("Elemen terdepan : " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print14() {
        if (isEmpty14()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
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

    public void Enqueue14(int dt) {
        if (isFull14()) {
            System.out.println("Queue overflow");
            System.exit(1);
        } else {
            if (isEmpty14()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }    

    public int Dequeue14() {
        int dt = 0;
        if (isEmpty14()) {
            System.out.println("Queue underflow");
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (isEmpty14()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

}