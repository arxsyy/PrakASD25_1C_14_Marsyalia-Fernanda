package Pertemuan12;

public class SingleLinkedList14 {
    NodeMahasiswa14 head;
    NodeMahasiswa14 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print14() {
        if (!isEmpty()) {
            NodeMahasiswa14 tmp = head;
            System.out.println("Isi Linked List :\t");
            while (tmp != null) {
                tmp.data.tampilInformasi14();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst14(Mahasiswa14 input) {
        NodeMahasiswa14 ndInput = new NodeMahasiswa14(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast14(Mahasiswa14 input) {
        NodeMahasiswa14 ndInput = new NodeMahasiswa14(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter14(String key, Mahasiswa14 input) {
        NodeMahasiswa14 ndInput = new NodeMahasiswa14(input, null);
        NodeMahasiswa14 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt14 (int index, Mahasiswa14 input) {
        if (index < 0) {
            System.out.println("index salah");
        } else if (index == 0) {
            addFirst14(input);
        } else {
            NodeMahasiswa14 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa14(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
