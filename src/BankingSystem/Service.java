package BankingSystem;

public class Service {
    public void pay(Account account, int amount) {
        Bill bill = account.getBill();
        if (bill.getAmount() < amount) {
            System.out.println("Недостаточно средств у владельца: " + account.getAccountHolder().getName() + " " + account.getAccountHolder().getSurName() + ", счет: " + bill.getAmount());
        } else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Происподит операция платежа, владельца:  "  + account.getAccountHolder().getName() + " " + account.getAccountHolder().getSurName() + ", текущее состояние счета: " + currentBillAmount);
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Новое значение счета: " + account.getAccountHolder().getName() + " " + account.getAccountHolder().getSurName() + ", счет: " + bill.getAmount());
        }

    }
}
