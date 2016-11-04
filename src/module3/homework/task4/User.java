package module3.homework.task4;

import java.util.Date;

public class User {
    private String name;
    private int balance;
    private Date startOfWork;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, Date startOfWork, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.startOfWork = startOfWork;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }



    void paySalary(int money){

        if (money < 0)
            System.out.println("Access Denied!");
        else
            balance += money;
    }

    public int withdraw(int summ){


        if (summ < 0){
            System.out.println("Access Denied!");
            return 0;
        }
        double commision = (summ < 1000)? .05: .1;

        int tempBalance = (int) (balance - summ - (summ*commision));

        if (tempBalance < 0){
            System.out.println("NO");
            return 0;
        }else {
            System.out.println("YES");
            balance = tempBalance;
            return summ;
        }
    }

    public void monthIncreaser(int addMonth){

        if (addMonth <= 0)
            return;

        monthsOfEmployment += addMonth;
    }

    int companyNameLenght(){
        return companyName.length();
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getStartOfWork() {
        return startOfWork;
    }

    public void setStartOfWork(Date startOfWork) {
        this.startOfWork = startOfWork;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    //a few constructors



}
