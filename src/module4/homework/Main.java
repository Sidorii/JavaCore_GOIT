package module4.homework;


public class Main {
    public static void main(String[] args) {


        Bank bank1 = new EUBank(Currency.EUR,100000,2435432,"Ukraine",10);
        //bank1.
        Bank bank2 = new USBank(Currency.USD,1043400,2343545,"USA",50);
        //bank2
        Bank bank3 = new ChinaBank(Currency.USD,103434000,34345432,"China",1000);

        BankSystemImpl bankSystem = new BankSystemImpl();

        User user1 = new User(1000,4000);
        User user2 = new User(1000,4000);
        User user3 = new User(1000,4000);
        User user4 = new User(1000,4000);
        User user5 = new User(1000,4000);
        User user6 = new User(1000,4000);

        user1.setBank(bank1);
        user2.setBank(bank1);
        user3.setBank(bank2);
        user4.setBank(bank2);
        user5.setBank(bank3);
        user6.setBank(bank3);


        System.out.println(user1);
        bankSystem.withdrawOfUser(user1,100);
        System.out.println(user1);

        System.out.println("_________________________________");
        System.out.println(user3);
        System.out.println(user4);
        bankSystem.transferMoney(user3,user4,432);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println("_________________________________");
        System.out.println(user3);
        System.out.println(user5);
        bankSystem.paySalary(user3);
        bankSystem.paySalary(user5);
        System.out.println(user3);
        System.out.println(user5);
    }
}
