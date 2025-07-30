package queue;

public class CircularBuffer {
    private int[] buffer;
    private int size;
    private int start = 0;  // points to the oldest element
    private int count = 0;  // number of elements currently in buffer

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    // Insert element into buffer
    public void insert(int value) {
        int end = (start + count) % size;
        if (count == size) {
            // Buffer full, overwrite oldest element
            buffer[start] = value;
            start = (start + 1) % size; // Move start forward
        } else {
            buffer[end] = value;
            count++;
        }
    }

    // Display current buffer elements in order from oldest to newest
    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++) {
            int index = (start + i) % size;
            System.out.print(buffer[index]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();  

        cb.insert(4);
        cb.display();  

        cb.insert(5);
        cb.display();  
    }
}

