package sampleproblem;

class CustomHashMap {

    // Node class for key-value pair
    class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // size of the bucket array
    private final int SIZE = 10;
    private Node[] bucket;

    public CustomHashMap() {
        bucket = new Node[SIZE];
    }

    // put method to insert key-value pair
    public void put(int key, int value) {
        int index = key % SIZE;
        Node head = bucket[index];

        // check if key already exists and update
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // insert at beginning of chain
        Node newNode = new Node(key, value);
        newNode.next = bucket[index];
        bucket[index] = newNode;
    }

    // get method to retrieve value by key
    public int get(int key) {
        int index = key % SIZE;
        Node head = bucket[index];

        // search the key
        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }

        return -1; // not found
    }

    // remove method to delete
    public void remove(int key) {
        int index = key % SIZE;
        Node head = bucket[index];
        Node prev = null;

        // search and unlink the node with matching key
        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    bucket[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    // display contents 
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            Node head = bucket[i];
            while (head != null) {
                System.out.print("[" + head.key + " -> " + head.value + "] ");
                head = head.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, 10);
        map.put(11, 110);
        map.put(2, 20);
        map.display();

        System.out.println("Value for key 11: " + map.get(11));

        map.remove(11);
        map.display();
    }
}
