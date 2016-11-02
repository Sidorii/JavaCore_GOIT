package module2;

/**
 * Created by Иван on 02.11.2016.
 */
public class BankExample {

    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    private static int[] balances = {1200, 250, 2000, 500, 3200};

    public static void main(String[] args) {

        withdrawBalance(100,10);
        withdrawBalance(100,99);

        System.out.println();

        withdrawBalance("Ann",100);
        withdrawBalance("Oww",490);
        withdrawBalance("Ivan",1000);

        System.out.println();

        fundBalance("Oww",100);
        fundBalance("Ann",-20);
        fundBalance("Ivan",100);
    }


    //HOMEWORK 2.1
    static double withdrawBalance(double balance, double withdrawal) {

        double commision = 0.05;


        double resultBalance = balance - withdrawal - (withdrawal*commision);

        if (resultBalance < 0){
            System.out.println("NO");
            return balance;
        }else {
            System.out.println("OK " + commision + " " + resultBalance);
            return resultBalance;
        }


    }

    //HOMEWORK 2.2
    static double withdrawBalance(String ownerName, double withdrawal) {

        int pointer = findUserByName(ownerName);


        if (pointer == ownerNames.length){
            System.out.println("User not defined!");
            return 0;
        }

        double commision  = .05d;

        double result = balances[pointer] - withdrawal - (withdrawal*commision);

        if (result < 0){
            System.out.println(ownerNames[pointer] + " NO");
            return balances[pointer];
        }else {
            System.out.println(ownerNames[pointer] + " " + withdrawal + " " + result);
            return result;
        }
    }

    static int findUserByName(String name){
        int pointer;

        for(pointer = 0; pointer < ownerNames.length;pointer++)
            if (name.equals(ownerNames[pointer]))
                break;
        return pointer;
    }

    //HOMEWORK 2.3
    static double fundBalance(String ownerName, double fund) {

        if (fund < 0) {
            System.out.println("Access denied!");
            return 0;
        }

        int pointer = findUserByName(ownerName);

        if (pointer == ownerNames.length){
            System.out.println("User not defined!");
            return 0;
        }

        balances[pointer] += fund;
        System.out.println(ownerName + " " + balances[pointer]);

        return balances[pointer];
    }
}
