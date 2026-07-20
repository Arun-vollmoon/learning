import java .util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;
//        all class creating objects
        Deposit dep = new Deposit();
        Withdraw with = new Withdraw();
        check_balance check = new check_balance();

        while (running) {
            System.out.println(""" 
                    your choice
                       deposit money enter 1..
                       withdraw money enter 2..
                       check balance enter 3..
                       Exit enter 4
                        Enter your choice""");

            int choice = sc.nextInt();
            char i;
            switch (choice) {
                case 1:
                    dep.inc_balance();
                    System.out.println("you want to continue Y/N");
                    i=sc.next().charAt(0);
                    if(i=='y'||i=='Y'){
                        System.out.println("-----***--***-----");
                    }
                    else {
                        running=false;
                    }
                    break;
                case 2:
                    with.dec_balance();
                    System.out.println("you want to continue Y/N");
                    i=sc.next().charAt(0);
                    if(i=='y'||i=='Y'){
                        System.out.println("-----***--***-----");
                    }
                    else {
                        running=false;
                    }
                    break;
                case 3:
                    check.checkBalance();
                    System.out.println("you want to continue Y/N");
                    i=sc.next().charAt(0);
                    if(i=='y'||i=='Y'){
                        System.out.println("-----***--***-----");
                    }
                    else {
                        running=false;
                    }
                    break;
                case 4:
                    System.out.println(".....Thanks for visiting.....");
                    running = false;
                    break;
                default:
                    System.out.println("......please entered valid character......");
            }
        }
    }
    }





