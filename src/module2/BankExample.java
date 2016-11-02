package module2;

/**
 * Created by Иван on 02.11.2016.
 */
public class BankExample {

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        withdrawBalance(100,10);
        withdrawBalance(100,99);

    }


    //HOMEWORK 2.1
    static double withdrawBalance(double balance, double withdrawal) {

        double commision = 0.05;


        double resultBalance = balance - withdrawal - (withdrawal*commision);

        if (resultBalance < 0){
            System.out.println("NO");
        }else {
            System.out.println("OK " + commision + " " + resultBalance);
        }

        
        return resultBalance;
    }
