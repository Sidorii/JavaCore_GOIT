package module6.HW;

public final class ArrayUtils {

    public static int sum(int array[]){

        int sum = 0;
        for (int value:array)
            sum += value;

        return sum;
    }


    public static int min(int array[]){

        int min = Integer.MAX_VALUE;

        for (int value:array){
            if (value < min)
                min = value;
        }
        return min;
    }


    public static int max(int array[]){

        int max = Integer.MIN_VALUE;

        for(int value:array){
            if (value > max)
                max = value;
        }

        return max;
    }


    public static int maxPositive(int array[]){

        int max = 0;

        for(int value:array){
            if (value > max && value >= 0)
                max = value;
        }

        return max;
    }


    public static int multiplication  (int array[]){
        int result = 1;

        for(int value:array)
            result *= value;

        return result;
    }


    public static int modulus(int array[]){

        int first = array[0], last = array[array.length-1];

        if (last != 0)
            return first%last;
        else
            return 0;
    }

    public static int secondLargest(int array[]){

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


    public static int[] reverse(int []array){

        int endOfArray = array.length -1;
        int buffer;

        for(int i = 0; i <= endOfArray/2; i++){
            buffer = array[i];
            array[i] = array[endOfArray-i];
            array[endOfArray-i] = buffer;
        }
        return array;
    }

    public static int [] findEvenElements(int[]array){

        int []result = new int[array.length];
        int j = 0;

        for(int i = 0 ; i < array.length; i++)
           if(array[i]%2 == 0)
               result[j++] = array[i];

        int resultSized[] = new int[j];

        for(;j > 0;) {
            resultSized[--j] = result[j];
        }

        return resultSized;
    }

    public static void main(String[] args) {
        findEvenElements(new int[]{4,5,8,6,1,2,3});
    }

}
