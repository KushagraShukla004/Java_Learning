package exceptionHandling;

public class throwsDemo {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[3];
        try {
            for (int i = 0; i < 4; i++) {
                arr[i] = i;
            }
            System.out.println("");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("fillin: " + e.fillInStackTrace());
            System.out.println("Cause: " + e.getCause());
            System.out.println("local: " + e.getLocalizedMessage());
            System.out.println("Message: " + e.getMessage());
            System.out.println("trace: " + e.getStackTrace());
            System.out.println("\ntrace1: ");
            e.printStackTrace();
            System.out.println("String: ");
            e.toString();
            System.out.println("");
            System.out.println("");
            System.out.println("oops we went too far");
            throw (Exception) new Exception().initCause(e);
        } finally {
            System.out.println(arr);
        }
    }
}
