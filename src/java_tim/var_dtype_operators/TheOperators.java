package java_tim.var_dtype_operators;

public class TheOperators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = "+ result);

        int previousResult = result;
        result = result -1;
        System.out.println(previousResult + " -1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 10 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("now result is: " + result);

        result++;
        System.out.println("now: " + result);
        result --;
        System.out.println("now: " + result);
        result +=2;
        System.out.println("now: " + result);
        result *= 10;
        System.out.println("now: " + result);
        result-= 10;
        System.out.println("now: " + result);
        result/=10;
        System.out.println("now: " + result);

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not a alien");
        }

        int topScore = 100;

        if(topScore == 100)
            System.out.println("you got the best score!");
        // you have < > == <= >= !=
    }
}
