import java.util.*;
public class lab04{
        static int acc_num;
        static String holder_name;
        static double acc_bal;
        static ArrayList<String> transactions;
        public static void initialize(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your account number: ");
            acc_num = sc.nextInt();
            System.out.print("Enter account holder's name: ");
            holder_name = sc.next();
            System.out.print("Enter your balance: ");
            acc_bal = sc.nextDouble();
            transactions = new ArrayList<>();
            transactions.add("Initial balance: " + acc_bal);
        }
        public static void deposit(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the amount you want to deposit: ");
            float amt = sc.nextFloat();
            acc_bal += amt;
            System.out.println("Your money has been successfully credited to your account number "+acc_num+" Your current balance is "+acc_bal);
            transactions.add("Deposit: "+amt);
        }
        public static void withdraw(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the amount you want to withdraw: ");
            int amt = sc.nextInt();
            if (amt>acc_bal){
                System.out.print("Insufficient balance");
            }else{
            acc_bal -= amt;
            System.out.println("Your money has been successfully debited to your account number "+acc_num+" Your current balance is "+acc_bal);
            transactions.add("Withdraw: "+ amt);
            }
        }
        public static void transaction(){
            for (int i= 0; i<transactions.size(); i++){
                System.out.print(transactions.get(i));
            }
        }
        public static void acc_summ(){
            System.out.println("Account number: "+acc_num);
            System.out.println("Account holder name: "+holder_name);
            System.out.println("Account Balance: "+acc_bal);
        }
        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            System.out.println("Welcome to Christ Bank!");
            initialize();
            int choice = 0;
            do{
                System.out.println("Select an option: ");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Print transactions");
                System.out.println("4. Print account summary");
                System.out.println("Press 0 to exit");
                choice = sc.nextInt();
                switch(choice){
                    case 1:
                        deposit();
                        break;
                    case 2:
                        withdraw();
                        break;
                    case 3:
                        transaction();
                        break;
                    case 4:
                        acc_summ();
                        break;
                    case 0:
                        System.out.println("Exiting the program");
                    default:
                        System.out.print("Invalid choice. Please choose an appropriate option.");

                }
            }while (choice!=0);
        }

    }