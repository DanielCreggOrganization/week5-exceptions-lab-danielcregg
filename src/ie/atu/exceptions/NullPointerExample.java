package ie.atu.exceptions;

public class NullPointerExample {
    public static void main(String[] args) {
        //String text = null;
        String text = "Hello, World!";
        System.out.println(text.length()); // Throws NullPointerException
    }
}