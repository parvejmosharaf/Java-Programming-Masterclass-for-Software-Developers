package java_tim.var_dtype_operators;

public class ByteShortInt {
    public static void main(String[] args) {
        // 1 byte = 8 bit

        //int take 4 byte = 32 bit
        int minValue = - 2147483648;
        int maxValue = 2147483647;

        //byte take 1 byte = 8 bit
        byte byteValue = -128;
        byte newByteValue = (byte) (byteValue/2);
        System.out.println("Byte value: " + newByteValue);

        // short take 2 byte = 16 bit
        short shortValue = 32767;

        // long take 8 byte = 64 bit
        long longValue = 100L;
    }
}
