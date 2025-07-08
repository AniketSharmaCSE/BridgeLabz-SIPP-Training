package QueueFromStack;

public class Main {
    public static void main(String[] args) {
        QueueFromStack q = new QueueFromStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); 
        System.out.println(q.peek());    
        System.out.println(q.dequeue()); 

        q.enqueue(40);
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
    }
}
