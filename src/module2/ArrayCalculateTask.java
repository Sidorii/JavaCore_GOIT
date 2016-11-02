package module2;

import org.omg.CORBA.INTERNAL;

/**
 * Created by Иван on 02.11.2016.
 */
public class ArrayCalculateTask {

    public static void main(String[] args) {

        int arrayInt[] = {-60,6,-8,-45,32,-58,48,-65,-12,-560};
        double arrayDouble[] = {0.0,12.456,-564.543,123.486,78.2,-798.56,45.2,2.0,-7.0,54.078};

        System.out.println("Integer");
        System.out.println("SUM=" + sum(arrayInt));
        System.out.println("MIN= "+ min(arrayInt));
        System.out.println("MAX= " + max(arrayInt));
        System.out.println("MAX_POS= " + maxPositive(arrayInt));
        System.out.println("MULTIPLICATION= " + multiplication(arrayInt));
        System.out.println("MOD= " + modulus(arrayInt));
        System.out.println("SEC_LARG= " + secondLargest(arrayInt));

        System.out.println();
        System.out.println("Double");
        System.out.println("SUM= " + sum(arrayDouble));
        System.out.println("MIN= " + min(arrayDouble));
        System.out.println("MAX= " + max(arrayDouble));
        System.out.println("MAX_POS= " + maxPositive(arrayDouble));
        System.out.println("MULTIPLICATION= " + multiplication(arrayDouble));
        System.out.println("MOD= " + modulus(arrayDouble));
        System.out.println("SEC_LARG= " + secondLargest(arrayDouble));

    }

    static int sum(int array[]){

        int sum = 0;
        for (int value:array)
            sum += value;

        return sum;
    }

    static double sum(double[] array){

        double sum = .0d;

        for(double value:array)
            sum += value;

        return sum;
    }

    static int min(int array[]){

        int min = Integer.MAX_VALUE;

        for (int value:array){
            if (value < min)
                min = value;
        }
        return min;
    }

    static double min(double array[]){

        double min = Double.MAX_VALUE;

        for(double value:array){
            if (value < min)
                min = value;
        }

        return min;
    }

    static int max(int array[]){

        int max = Integer.MIN_VALUE;

        for(int value:array){
            if (value > max)
                max = value;
        }

        return max;
    }

    static double max(double array[]){

        double max = Double.MIN_VALUE;

        for (double value:array){
            if (value > max)
                max = value;
        }

        return max;
    }

    static int maxPositive(int array[]){

        int max = 0;

        for(int value:array){
            if (value > max && value >= 0)
                max = value;
        }

        return max;
    }

    static double maxPositive(double array[]){
        double max = 0;

        for(double value:array){

            if (value > max && value >= 0)
                max = value;
        }

        return max;
    }

    static int multiplication  (int array[]){
        int result = 1;

        for(int value:array)
            result *= value;

        return result;
    }

    static double multiplication  (double array[]){

        double result = 1;

        for(double value:array)
            result *= value;

        return result;

    }

    static int modulus(int array[]){

        int first = array[0], last = array[array.length-1];

        if (last != 0)
            return first%last;
        else
            return 0;
    }

    static double modulus(double array[]){

        double first = array[0], last = array[array.length-1];

        if (last != 0)
            return first%last;
        else
            return .0d;
    }

    static int secondLargest(int array[]){

        int firstLargest, secondLargest;
        firstLargest = secondLargest = Integer.MIN_VALUE;

        for(int value:array){

            if (value > firstLargest)
                firstLargest = value;

            if (value > secondLargest && value < firstLargest)
                secondLargest = value;

        }
        return secondLargest;
    }

    static double secondLargest(double array[]){

        double firstLargest, secondLargest;
        firstLargest = secondLargest = Double.MIN_VALUE;

        for(double value:array){

            if (value > firstLargest)
                firstLargest = value;

            if (value > secondLargest && value < firstLargest)
                secondLargest = value;
        }
        return secondLargest;
    }

}
