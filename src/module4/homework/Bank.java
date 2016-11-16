package module4.homework;

public abstract class Bank {
    private Currency currency;
    private int totalCapital;
    private long rating;
    private String bankCountry;
    private int numberOfEmployee;


    public Bank(Currency currency, int totalCapital, long rating, String bankCountry, int numberOfEmployee) {
        this.currency = currency;
        this.totalCapital = totalCapital;
        this.rating = rating;
        this.bankCountry = bankCountry;
        this.numberOfEmployee = numberOfEmployee;
    }


    abstract int getLimitOfFunding();
    abstract long getMonthlyRate();
    abstract int getCommission(int summ);
    abstract int getLimitOfWithdrawal();

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    public int getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(int totalCapital) {
        this.totalCapital = totalCapital;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "currency=" + currency +
                '}';
    }
}
