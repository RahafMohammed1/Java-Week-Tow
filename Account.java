
import java.io.IOException;
import java.util.InputMismatchException;
public class Account {
        private String id;
        private String name;
        private int balance=0;

        public Account(String id, String name){
            this.id=id;
            this.name=name;
        }
        public Account(String id, String name, int balance)
        {
            this.id=id;
            this.name=name;
            this.balance=balance;
        }
        public Account(){}
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }
        public void credit(int amount)throws IOException {
            if(amount<=balance) {
                balance = balance - amount;
                System.out.println("The credit is done correctly"+"\n"+"your balance = "+balance);
            }
            else
                throw new IOException(" Error,the amount you want to credit is greater than your balance"+"\n"+"your balance = "+getBalance());
        }
        public int debit(int amount){
            balance=balance+amount;
            return balance;
        }
        public void transferTo(Account account, int amount)throws IOException {
            if (amount <= balance) {
                this.balance = this.balance - amount;
                account.balance = account.balance + amount;
                System.out.println("the Transfer is done" + "\n" + "your balance = " + getBalance());
            } else {
                throw new IOException("Error,the amount you want to Transfer is greater than your balance" + "\n" + "your balance = " + getBalance());
            }
        }
        public String toString(){
            return "id = "+id+"\n"+"name = "+name+"\n"+"balance = "+balance+"\n";
        }

    }

