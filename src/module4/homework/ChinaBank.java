package module4.homework;

public class ChinaBank  extends Bank {


    public ChinaBank(Currency currency, int totalCapital, long rating, String bankCountry, int numberOfEmployee) {
        super(currency, totalCapital, rating, bankCountry, numberOfEmployee);
    }

    @Override
    int getLimitOfFunding() {
        return (getCurrency() == Currency.EUR)?5000:10000;
    }

    @Override
    long getMonthlyRate() {
        return (getCurrency() == Currency.EUR)?0:1;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) commission = 3;
            else commission = 5;
        } else {
            if (summ < 1000)
                commission = 10;
            else
                commission = 11;
        }
        return commission;
    }

    @Override
    int getLimitOfWithdrawal() {
        return (getCurrency() == Currency.EUR)?150:100;
    }

    @Override
    public String toString() {
        return "China" + super.toString();
    }
}
