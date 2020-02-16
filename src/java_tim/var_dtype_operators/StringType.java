package java_tim.var_dtype_operators;

import org.w3c.dom.ls.LSOutput;

public class StringType {
    public static void main(String[] args) {
        String myString = "This is a string.";
        System.out.println("myString is: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("new string is: " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println("myString is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is: "+ numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("last string: " + lastString);
    }
}
