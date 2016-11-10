package module4.homework;


public class EUBank extends Bank {


    public EUBank(Currency currency, int totalCapital, long rating, String bankCountry, int numberOfEmployee) {
        super(currency, totalCapital, rating, bankCountry, numberOfEmployee);
    }


    @Override
    int getLimitOfFunding() {
        return (getCurrency() == Currency.EUR)?20000:10000;
    }

    @Override
    long getMonthlyRate() {
        return (getCurrency() == Currency.EUR)?1:0;
    }

    @Override
    int getCommission(int summ) {
        int commision;

        if(summ < 1000){

            if (getCurrency() == Currency.EUR)
                commision = 2;
            else
                commision = 5;
        }else{

            if (getCurrency() == Currency.EUR)
                commision = 4;
            else
                commision = 7;
        }

        return commision;
    }

    @Override
    int getLimitOfWithdrawal() {
        return (getCurrency() == Currency.EUR)?2200:2000;
    }

    @Override
    public String toString() {
        return "EU" + super.toString();
    }
}
