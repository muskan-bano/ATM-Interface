package ATMInterface;

import java.util.Scanner;

public class UseBankAccount {
    public static int takeIntegerInput(int limit){
        int input =0 ;
        boolean flag = false;
        while (!flag){
            try{
                Scanner s = new Scanner(System.in);
                input = s.nextInt();
                flag = true;
                if(flag && input > limit || input < 1 ){
                    System.out.println("choose the number between 1 to " + limit);
                    flag = false;
                }
            }catch (Exception e){
                System.out.println("Enter only Integer value ");
                flag = false;
            }
        };
        return input;
    }
    public static void main(String[] args) {
        System.out.println("\n ----------- WELCOME TO MUSKAN ATM SYSTEM -----------");
        System.out.println("1. Register \n2. Exit ");
        System.out.println("Enter Your Choice - ");
        int choice = takeIntegerInput(2);
        
        if(choice == 1){
            BankAccount b = new BankAccount();
            b.register();
            while(true){
                System.out.println("\n1. Login \n2. Exit");
                System.out.println("Enter Your Choice - ");
                int ch = takeIntegerInput(2);
                if(ch == 1){
                    if(b.login()){
                        System.out.println("\n\n ---------WELCOME BACK " + b.name + "---------\n");
                        boolean isFinished = false;
                        while (!isFinished){
                            System.out.println("\n1. Withdraw \n2. Deposit \n3. Transaction \n4. Check Balance \n5. Transfer History \n6. Exit");
                            System.out.println("Enter Your Choice - ");
                            int c = takeIntegerInput(6);
                            switch (c){
                                case 1:
                                b.withdraw();
                                break;
                                case 2:
                                    b.deposit();
                                    break;
                                case 3:
                                    b.transfer();
                                    break;
                                case 4:
                                    b.checkBalanced();
                                    break;
                                case 5:
                                    b.transHistory();
                                    break;
                                case 6:
                                   isFinished = true;
                                    break;

                            }
                        }
                    }
                }else{
                    System.exit(0);
                }
            }
                    
        }
 
    }

}
