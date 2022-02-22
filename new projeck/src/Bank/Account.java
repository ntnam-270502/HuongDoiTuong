package Bank;

public class Account {
    int account_number;
    int account_balance;
    Account(int a, int b){
        account_number = a;
        account_balance = b;
    }
    public void show_data(){
        System.out.println("Account number:"+account_number);
        System.out.println("Số tiền:"+account_balance);
    }
    public void Naptien(int amount){
        if(amount > 0){
            account_balance += amount;
        }
        else System.out.println("Số tiền đã nhập không hợp lệ!!!");
    }
    public void Ruttien(int amount){
        if(amount < account_balance&&amount > 0){
            account_balance -= amount;
        }
        else System.out.println("Số tiền đã nhập không hợp lệ!!!");
    }
    
}
