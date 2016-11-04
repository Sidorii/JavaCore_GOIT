package module3.homework.task2;

public class Arithmetic {


    int add(Integer...numbs){

        int sum = 0;

        for(Integer i:numbs)
            sum+=i;
        return sum;
    }

}
