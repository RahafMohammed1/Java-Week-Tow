import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {
        private String id;
        private String name;
        private int salary;

        public Employee(String id ,String name,int salary){
            this.id=id;
            this.name=name;
            this.salary=salary;
        }
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

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {this.salary = salary;}
        public int getAnnualSalary()
        {
            return salary*12;
        }
        public void raisedSalary() throws IOException {
            int percent=0;
            Scanner s2=new Scanner(System.in);
                System.out.println("Enter the percent of increase that you expect to get it this year");
                percent = s2.nextInt();
                if(percent <1)
                    throw new IOException("the percent must be greater than or equal 1");
            int raise=(salary * percent/100);
            System.out.println("the raise amount = "+raise+" SR");
            int raisedsalary=salary+raise;
            System.out.println("the raise salary = "+raisedsalary+" SR");
        }
        public String toString()
        {
            return "Employee id : "+id+"\n"+"Employee name : "+name+"\n"+"Employee salary : "+salary;
        }

    }


