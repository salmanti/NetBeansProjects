package q14;

public class Exception {

    public static void main(String[] args) {
        try {

//            onko();
//            arr();
            str();

        } catch (ArithmeticException e) {
            System.out.println(" Exception" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Exception" + e);
        } catch (NullPointerException e) {
            System.out.println(" Exception" + e);
        }
    }

    public static void onko() {
        int x = 10;
        int y = 0;
        int result = x / y;

        System.out.println("cal of x and Y :" + result);
    }

    public static void arr() {
        int[] x = {21, 25, 1, 88};

        System.out.println("arr_________ :" + x[5]);
    }

    public static void str() {
        String b = null;

        System.out.println("cal of x and Y :" + b.length());
    }
}
