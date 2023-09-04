package ATMInterface;

import java.util.Scanner;

public class BankAccount {
    String name;
    String UserName;
    String UserPin;
    String AccountNo;
    float Balance = 10000f;
    int Transactions = 0;
    String TransactionHistory = " ";

    private static int takeIntegerInput(int i) {
        //TODO Auto - generated method stub
        return 0;
    }

    public void register() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your name - ");
        this.name = s.nextLine();
        System.out.println("Enter Your Username - ");
        this.UserName = s.nextLine();
        System.out.println("Enter Your Pin Code - ");
        this.UserPin = s.nextLine();
        System.out.println("Enter Your Account No. - ");
        this.AccountNo = s.nextLine();
        System.out.println("Registration Complete Successfully. Please Log in!! ");
    }

    public boolean login() {
        Scanner s = new Scanner(System.in);
        boolean isLogin = false;
        while (!isLogin) {
            System.out.println("Enter Your Username - ");
            String UserName = s.nextLine();
            if (UserName.equals(UserName)) {
                while (!isLogin) {
                    System.out.println("Enter Your Pin Code - ");
                    String UserPin = s.nextLine();
                    if (UserPin.equals(UserPin)) {
                        while (!isLogin) {
                            System.out.println("LOGIN SUCCESSFULLY !!");
                            isLogin = true;
                        }
                    } else {
                        System.out.println("Incorrect Pincode !!");
                    }

                }
            } else {
                System.out.println("Username Not Found !!");
            }

        }
        return isLogin;
    }

    public void withdraw() {
        System.out.println("Enter Amount to Withdraw ");
        Scanner s = new Scanner(System.in);
        float amount = s.nextFloat();
        try {
            if (Balance >= amount) {
                Transactions++;
                Balance -= amount;
                System.out.println("Withdraw Successfully !!");
                String str = amount + "Rs. Withdrawn\n";
                TransactionHistory = TransactionHistory.concat(str);

            } else {
                System.out.println("/nInsufficient Balanced ");
            }
        } catch (Exception e) {

        }
    }

    public void deposit() {
        System.out.println("Enter Amount to Deposit ");
        Scanner s = new Scanner(System.in);
        float amount = s.nextFloat();
        try {
            if (amount <= 10000f) {
                Transactions++;
                Balance += amount;
                System.out.println("Successfully Deposited");
                String str = amount + "Rs. Withdrawn\n";
                TransactionHistory = TransactionHistory.concat(str);
            } else {
                System.out.println("Sorry.. Transaction Limit is 10000.0 !!");
            }
        } catch (Exception e) {

        }
    }


    public void transfer() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Reciepent Name - ");
        String Reciepent = s.nextLine();
        System.out.println("Enter Amount to Transfer - ");
        float amount = s.nextFloat();
        try {
            if (Balance <= amount) {
                if (Balance >= amount) {
                    Transactions++;
                    Balance -= amount;
                    System.out.println("Successfully Transfered to " + Reciepent);
                    String str = amount + "rs Transfered to " + Reciepent + "\n";
                    TransactionHistory = TransactionHistory.concat(str);
                } else {
                    System.out.println("Sorry... Limit is 50000.00 !!");
                }
            } else {
                System.out.println("Insufficient Balance !!");
            }
        } catch (
                Exception e) {
        }
    }


            public void checkBalanced(){

            System.out.println("\n" + Balance + "Rs ");

        }
            public void transHistory(){
                if (Transactions == 0) {
                    System.out.println("Empty");
                } else {
                    System.out.println("\n" + TransactionHistory);
                }
            }
        }


