package BankingSystem;

public class DepService {
    public void deposit(Account account, int amount){
        System.out.println("Идет пополнение счета, владельца : " + account.getAccountHolder().getName()+ " " + account.getAccountHolder().getSurName() + " текущее состояние: " +account.getBill().getAmount());
        account.getBill().setAmount(account.getBill().getAmount() + amount);
        System.out.println("Пополнение прошло успешно, состояние счета: " + account.getBill().getAmount());
    }
}
