package strings;

public class NullPointExceptionDemo {

    public static void generateException() {
        String text = null;
        System.out.println("Length: " + text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
    	handleException();
    	generateException();
        
    }
}
