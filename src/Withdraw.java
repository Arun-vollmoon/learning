import java.util.Scanner;

public class Withdraw extends Acc_balance{
    void dec_balance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How mush you withdraw $.. ");
        float withdraw_amount = sc.nextFloat();
        if (withdraw_amount <= getBalance()) {
            double bal=getBalance();
            bal =bal-withdraw_amount;
            setBalance(bal);
            System.out.println("......Your amount is credited succesfully......");
        } else {
            System.out.println("Insuficient balance.");
        }

    }
}