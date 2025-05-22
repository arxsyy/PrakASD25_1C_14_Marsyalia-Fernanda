package Pertemuan12;

public class QueueLL14 {
    NodeQueue14 front;
    NodeQueue14 rear;
    int size;

    public QueueLL14() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty14() {
        return size == 0;
    }

    public boolean isFull14() {
        return false;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    public void insert14(String data) {
        NodeQueue14 newNode = new NodeQueue14(data);
        if (isEmpty14()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public String call14() {
        if (isEmpty14()) {
            return "Antrian kosong";
        }
        String data = front.data;
        front = front.next;
        size--;
        if (isEmpty14()) {
            rear = null;
        }
        return data;
    }

    public String peekFront14() {
        if (isEmpty14()) {
            return "Antrian kosong";
        }
        return front.data;
    }

    public String peekRear14() {
        if (isEmpty14()) {
            return "Antrian kosong";
        }
        return rear.data;
    }

    public int getSize14() {
        return size;
    }

    public void displayQueue14() {
        if (isEmpty14()) {
            System.out.println("Antrian kosong");
            return;
        }
        NodeQueue14 temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}