package java_tim.var_dtype_operators;

public class QByteShortInt {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        short newShort =(short) (1000 + 10 *(myByte + myShort + myInt));
        System.out.println("My Long is: " + myLong);
        System.out.println("New short is: " + newShort);
    }
}
