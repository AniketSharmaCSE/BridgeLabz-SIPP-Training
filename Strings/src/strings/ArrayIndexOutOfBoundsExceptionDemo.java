package strings;
import java.util.*;

public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void generateException(String[] names, int index) {
        System.out.println("Name: " + names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled array index out of bounds exception");
        } catch (RuntimeException e) {
            System.out.println("Handled runtime exception");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }
        int index = sc.nextInt();
        handleException(names, index);
        generateException(names, index);
        
    }
}
