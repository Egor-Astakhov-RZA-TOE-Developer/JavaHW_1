package practicalLesson.Task_1;

public class BankAccount {
    private int money;

    public BankAccount(int money){
        this.money = money;
    }
    public int checkMoney(){
        return money;
    }

    public void putMoney(int quantity){
        money += quantity;
    }
    public int withdrawMoney(){
        int res = money;
        money = 0;
        return res;
    }
    public double checkInDollars(){
        return money / ExchangeRates.getDollarRate();
    }

    public double checkInEuros(){
        return money / ExchangeRates.getEuroRate();
    }

}
