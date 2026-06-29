package certificacion.fase11.practica09;

interface  Account{
    public default String getId(){
        return "0000";
    }
}

interface  PremiumAccount extends Account{
    public String getId();
}
public class BankAccount implements PremiumAccount{

    public static void main(String[] args) {

        Account account = new BankAccount();
        System.out.println(account.getId());
    }

    @Override
    public String getId() {
        return "";
    }
}
