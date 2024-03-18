import java.io.*;
import java.util.*;
public class ATMOPERATION{
    public static void main(String[] args){
        int pin=4757;
        double available_balance=5246.30;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE PIN NUMBER\n");
        int user_pin=in.nextInt();
        if(user_pin==pin){
            System.out.println("WELCOME TO ATM SERVICE OF STATE BANK OF INDIA");
            System.out.println("SELECT AN OPERATION TO BE PERFORMED\n"
            + "PRESS 1 FOR WITHDRAWL\n"
            + "PRESS 2 FOR DEPOSIT\n"
            + "PRESS 3 FOR BALANCE ENQUIRY\n");
            int operation=in.nextInt();
            if(operation==1){
                System.out.println("ENTER THE AMOUNT TO BE WITHDRAWN:\n");
                double amount_to_be_withdrawn=in.nextInt();
                if(amount_to_be_withdrawn<=available_balance){
                    available_balance=available_balance-amount_to_be_withdrawn;
                    System.out.println("AMOUNT WITHDRAWN SUCCESSFULLY\n");
                    System.out.println("THE AVAILABLE BALANCE IS: " + available_balance + "\n");
                }
                else{
                    System.out.println("NO SUFFICIENT BALANCE\n");
                }
            }
            else if(operation==2){
                System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
                double deposit_amount=in.nextInt();
                available_balance=deposit_amount+available_balance;
                System.out.println("THE AVAILABLE BALANCE AFTER DEPOSITING " + deposit_amount + " was:" + available_balance);
            }
            else if(operation==3){
                System.out.println("THE AVAILABLE BALANCE IS " + available_balance);
            }
            else{
                System.out.println("ENTERED A IN VALID NUMBER");
            }
        }
        else {
            System.out.println("YOU HAVE ENTERED A WRONG PIN");
        }
    }
}