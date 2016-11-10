package module4.homework;

/**
 * Created by Andrey on 9/2/16.
 */
public class USBank extends Bank {


    public USBank(Currency currency, int totalCapital, long rating, String bankCountry, int numberOfEmployee) {
        super(currency, totalCapital, rating, bankCountry, numberOfEmployee);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    //
    int getCommission(int amount) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000) commission = 5;
            else commission = 7;
        } else {
            if (amount < 1000)
                commission = 6;
            else
                commission = 8;
        }
        return commission;
    }

    @Override
    int getLimitOfFunding() {

        int limit;
        if(getCurrency() == Currency.EUR)
            limit = 10000;
        else
            limit = Integer.MAX_VALUE;

        return limit;
    }

    @Override
    long getMonthlyRate() {
        return (getCurrency() == Currency.EUR)?2:1;
    }

    @Override
    public String toString() {
        return "USA" + super.toString();
    }
}
