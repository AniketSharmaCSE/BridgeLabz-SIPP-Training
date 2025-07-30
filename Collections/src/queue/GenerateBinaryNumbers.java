package queue;

import java.util.*;

public class GenerateBinaryNumbers {


    public static void generateBinaryNumbers(int N) {
        if (N <= 0) {
            System.out.println("[]");
            return;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            System.out.print(current + (i == N - 1 ? "" : ", "));
            queue.add(current + "0");
            queue.add(current + "1");
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of binary numbers to generate: ");
        int N = sc.nextInt();
        
        generateBinaryNumbers(N);
        
    }

}

