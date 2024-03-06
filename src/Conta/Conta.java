package Conta;

public class Conta {
    public int numberAccount;
    public String agency;
    private String accountName;
    private Double balance;

    public Conta() {
        super();
    }

    public Conta(int numberAccount, String agency, String accountName,Double balance) {
        super();
        this.numberAccount = numberAccount;
        this.agency = agency;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Olá "+ accountName + ", " +
                "obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", " +
                "conta " + numberAccount + " " +
                "e seu saldo " + balance + " já está disponível para saque";
    }
}
