public class Main {
    public static void main(String[] args) {
        byte byteBox = 127;
        short shortBox = 20000;
        // сужение
        byteBox = (byte) shortBox;

        System.out.println(byteBox);

        int intBox = 30000;
        long longBox = 150000;
        // сужение
        intBox = (int) longBox;

        System.out.println(intBox);

        float floatBox = 6;
        double doubleBox= 159.8;
        // расширение
        doubleBox = floatBox;

        System.out.println(floatBox);
    }
}