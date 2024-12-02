package CS133programs;

import java.util.Scanner;

class Bank{
    double s_balance=5250;
    double c_balance=5000;
    String name;
    int accno;

Bank(String name, int accno){
    this.name=name;
    this.accno=accno;
}

}

class Savings extends Bank{
    Scanner sc= new Scanner(System.in);

    Savings(String name, int accno) {
        super(name, accno);
    }


    void displaySavings(){
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accno);
        savingsBalance();
    }

    void compoundInterest(){
        double temp=(0.05*s_balance) + s_balance;
        System.out.println("Total Interest: " + temp);
    }

    void savingsWithdrawl(){
        System.out.println("Enter the amount to Withdraw: ");
        int withdrawnMoney = sc.nextInt();
        System.out.println("Money has been Withdrawn successfully: ");
        s_balance-=withdrawnMoney;
    }

    void savingsDeposit(){
        System.out.println("Enter the amount to Deposit: ");
        int deposit=sc.nextInt();
        s_balance = deposit + s_balance;
    }

    void savingsBalance(){
        System.out.println("Savings Account Balance: " + s_balance);
    }

}

class Current extends Bank{
    double temp=(0.05*c_balance) + c_balance;
    Current(String name, int accno) {
        super(name, accno);
    }


    void displayCurrent(){
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accno);
        currentBalance();
    }

    void currentWithdrawl(){
        Scanner sc= new Scanner(System.in);
        if(c_balance<5000 && c_balance>=4000){
            System.out.println("You have received a penalty of ₹100 ");
            System.out.println("Bank Balance Low: Cannot Withdraw");
            return;
        } else if (c_balance<4000 && c_balance>=3000) {
            System.out.println("You have received a penalty of ₹500 ");
            System.out.println("Bank Balance Low: Cannot Withdraw");
            return;
        }
        System.out.println("Enter the amount to Withdraw: ");
        int withdrawnMoney = sc.nextInt();
        System.out.println("Money has been Withdrawn successfully: ");
        c_balance-=withdrawnMoney;
    }

    void currentBalance(){
        System.out.println("Current Account Balance: " + c_balance);
        if(c_balance<5000 && c_balance>=4000){
            System.out.println("You have received a penalty of ₹100 ");

        } else if (c_balance<4000 && c_balance>=3000) {
            System.out.println("You have received a penalty of ₹500 ");
        }
    }

    void currentDeposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to Deposit: ");
        int deposit=sc.nextInt();
        c_balance = deposit + c_balance;
    }

}


public class bankProgram {
    public static void main(String[] args) {
        Scanner st= new Scanner(System.in);
        Savings obj1savings = new Savings("John Kumar",123456);
        Current obj1current = new Current("John Kumar",123456);

//        Savings obj2savings = new Savings("John Kumar",123456);
//        Current obj2current = new Current("John Kumar",123456);
        System.out.println("SELECT A CHOICE: ");
        int choice;
        while(true){
            System.out.println("Choice 1 → Deposit to Savings \n Choice 2 → Withdrawl From Savings \n Choice 3→ Deposit to Current \n Choice 4→Withdrawl From Current \n Choice 5 → Compound Interest \n Choice 6→Show Savings Account Information \n choice 7→ Show Current Account Information \n Choice 8→ Exit");
            choice = st.nextInt();

            if(choice==1){
                obj1savings.savingsDeposit();
            }

            else if(choice==2){
                obj1savings.savingsWithdrawl();
            }

            else if(choice==3){
                obj1current.currentDeposit();
            }

            else if(choice==4){
                obj1current.currentWithdrawl();
            }

            else if(choice==5){
                obj1savings.compoundInterest();
            }

            else if(choice==6){
                obj1savings.displaySavings();
            }
            else if(choice==7){
                obj1current.displayCurrent();
            }
            else break;
        }


    }
}
