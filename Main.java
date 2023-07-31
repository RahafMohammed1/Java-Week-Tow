
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
        public class Main {
            public static void chprogram() {
                int num = 0;
                Scanner s1 = new Scanner(System.in);
                do {
                    System.out.println("choose one of th following program option \n 1- Account \n 2- Employee \n 3- Stop");
                    try {
                        num = s1.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Error , please enter a Numerical value");
                    }
                    switch (num) {
                        case 1:
                            System.out.println("you have selected the Account program\n");
                            AccountProgram();
                            break;
                        case 2:
                            System.out.println("you have selected the Employee program\n");
                            EmployeeProgram();
                            break;
                        case 3:
                            break;

                        default:
                            System.out.println("please select number from options ");
                            chprogram();
                    }
                } while (num != 3);
            }

            public static void AccountProgram() {
                Account A1 = new Account("1234", "Majd", 20000);
                Account A2 = new Account("5678", "Rahaf", 20000);
                Scanner s1 = new Scanner(System.in);
                int num = 0;
                int amount;
                System.out.println("Hi " + A1.getName() + "..please choose one of following option");
                do {
                    System.out.println("\n"
                            + "0-for exit" + "\n"
                            + "1-print you name " + "\n"
                            + "2-print your Id" + "\n"
                            + "3-print your balance" + "\n"
                            + "4-if you want to credit" + "\n"
                            + "5-if you want to debit" + "\n"
                            + "6-To transfer a money to another user " + "\n"
                            + "7-to print your information");
                    try {
                        num = s1.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Error , please enter a Numerical value");
                        AccountProgram();
                    }
                    switch (num) {
                        case 0:
                            break;
                        case 1:
                            System.out.println("your name is : " + A1.getName());
                            break;
                        case 2:
                            System.out.println("your Id is : " + A1.getId());
                            break;
                        case 3:
                            System.out.println("your balance is : " + A1.getBalance());
                            break;
                        case 4:
                            System.out.println("please enter the amount : ");
                            try {
                                amount = s1.nextInt();
                                A1.credit(amount);
                            } catch (IOException e) {
                                System.out.println(e.getMessage());
                                AccountProgram();
                            } catch (InputMismatchException e) {
                                System.out.println("Error, Please enter Numeric value");
                                AccountProgram();
                            }
                            break;
                        case 5:
                            System.out.println("please enter the amount : ");
                            try {
                                amount = s1.nextInt();
                                A1.debit(amount);
                            } catch (InputMismatchException e) {
                                System.out.println("Error, Please enter Numeric value");
                                AccountProgram();
                            }
                            break;
                        case 6:
                            System.out.println("please enter the amount : ");

                            try {
                                amount = s1.nextInt();
                                A1.transferTo(A2, amount);
                            } catch (IOException e) {
                                System.out.println(e.getMessage());
                                AccountProgram();
                            } catch (InputMismatchException e) {
                                System.out.println("Error, Please enter Numeric value");
                                AccountProgram();
                            }
                            break;
                        case 7:
                            System.out.println(A1.toString());
                            break;
                    }
                } while (num != 0);
            }

            public static void EmployeeProgram() {
                Employee E1 = new Employee("1234", "Majd", 20000);
                Scanner s1 = new Scanner(System.in);
                int num=0;
                System.out.println("Hi " + E1.getName() + "..please choose one of following option");

                do {
                    System.out.println("\n"
                            + "0-for exit" + "\n"
                            + "1-print you name " + "\n"
                            + "2-print your Id" + "\n"
                            + "3-print your Salary" + "\n"
                            + "4-if you want to know your Annual salary" + "\n"
                            + "5-if you want to know your Salary After the raise " + "\n"
                            + "6-to print your information");
                    try {
                        num = s1.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Error , please enter a Numerical value");
                        EmployeeProgram();
                    }
                    switch (num) {
                        case 0:
                            break;
                        case 1:
                            System.out.println("your name is : " + E1.getName());
                            break;
                        case 2:
                            System.out.println("your Id is : " + E1.getId());
                            break;
                        case 3:
                            System.out.println("your Salary is : " + E1.getSalary());
                            break;
                        case 4:
                            System.out.println("your salary per month = " + E1.getSalary() + " your Annual salary = " + E1.getAnnualSalary());
                            break;
                        case 5:
                            try {
                                E1.raisedSalary();
                            } catch (IOException e) {
                                System.out.println(e.getMessage());
                                EmployeeProgram();
                            } catch (InputMismatchException e)
                            {
                                System.out.println("Error, Please enter Numeric value");
                                EmployeeProgram();
                            }
                            break;
                        case 6:
                            System.out.println(E1.toString());
                            break;
                    }

                } while (num != 0);
            }

                public static void main (String[]args){
                    chprogram();
                }
            }



