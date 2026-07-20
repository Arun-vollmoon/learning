import java.util.Scanner;

class Deposit extends Acc_balance{
    void inc_balance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How mush you deposit $.. ");
        float deposit_amount = sc.nextFloat();
        double bal=getBalance();
        bal = deposit_amount + bal;
        System.out.println(bal);
        setBalance(bal);
        System.out.println("......Your amount is deposited......");
    }
    void  showAccountBalance(){
        System.out.println("You account balance is "+getBalance());
    }
}