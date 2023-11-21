package w3;

public class Excption {

    public static void main(String[] args) {

        try {
//            abc();
//            arr();
            str();

        } catch (ArithmeticException e) {
            System.out.println("Exception"+e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception"+e);
        }
        
        catch (NullPointerException  e) {
            System.out.println("Exception"+e);
        }

    }

    public static void abc() {

        int x = 10;
        int y = 0;
        int result = x / y;
        System.out.println("cal of number :" + result);

    }
    public static void arr() {

       int[]arr={5,2,3,4};
        System.out.println("cal of number :" + arr[6]);

    }
    
    public static void str() {

       String a=null;
        System.out.println("cal of number :" + a.length());

    }

}
