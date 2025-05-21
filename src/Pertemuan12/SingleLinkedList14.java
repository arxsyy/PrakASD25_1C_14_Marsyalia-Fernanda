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

    public void getData14(int index) {
        NodeMahasiswa14 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi14();
    }

    public int indexOf14(String key) {
        NodeMahasiswa14 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst14() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast14() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa14 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove14(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa14 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst14();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt14(int index) {
        if (index == 0) {
            removeFirst14();
        } else {
            NodeMahasiswa14 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

}
