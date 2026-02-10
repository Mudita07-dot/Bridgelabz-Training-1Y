public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length()); // risky call
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException inside handleException(): " + e);
        }
    }

    public static void main(String[] args) {

        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }
        handleException();
    }
}