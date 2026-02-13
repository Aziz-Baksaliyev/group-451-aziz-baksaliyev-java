package classwork_4;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(owner + ": Пополнено на " + amount + ". Текущий баланс: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(" Ошибка (" + owner + "): Недостаточно средств. Баланс: " + balance);
        } else if (amount <= 0) {
            System.out.println(" Сумма должна быть больше 0.");
        } else {
            balance -= amount;
            System.out.println(owner + ": Снято " + amount + " Остаток: " + balance);
        }
    }

    public void showBalance() {
        System.out.println("Аккаунт: " + owner + " | Баланс: " + balance);
    }

    public void transfer(BankAccount targetAccount, double amount) {
        System.out.println("\n💸 Перевод от " + this.owner + " к " + targetAccount.owner + " на сумму " + amount);
        
        if (amount <= balance) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Перевод выполнен успешно");
        } else {
            System.out.println(" Перевод отклонен: не хватает денег");
        }
    }
}
