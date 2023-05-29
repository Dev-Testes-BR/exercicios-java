package orientacaoAObjetos.construtoresThisSobrecargaEncapsolamento.account.entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account() {
    }

    public Account(Integer number, String holder) {
        super();
        this.number = number;
        this.holder = holder;
    }

    public Account(Integer number, String holder, Double balance) {
        super();
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account "
                + getNumber()
                + ", Holder: "
                + getHolder()
                + ", Balance: $ "
                + String.format("%.2f", getBalance());
    }
}