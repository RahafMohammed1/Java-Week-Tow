import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static int addition(int a, int b) {return a + b;}
    public static int substruction(int a, int b) {
        return a - b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b) {
        return a / b;
    }
    public static int modulus(int a, int b) {
        return a % b;
    }
    //هنا في دالة الأصغر من سويت Exception إذا دخل اليوز نفس الرقمِ
    public static int min(int a, int b)throws IOException {
        if (a==b){
          throw new IOException("you entered same numbers please enter diffrent numbers");
        }
        if (a < b) {
            return a;
        } else return b;
    }
    //هنا في دالة الأكبر من سويت Exception إذا دخل اليوز نفس الرقمِ
    public static int max(int a, int b)throws IOException {
        if (a==b){
            throw new IOException("you entered same numbers please enter diffrent numbers");
        }
        if (a > b) {
            return a;
        } else return b;
    }
    public static int average(int a, int b) {
        return a + b / 2;
    }

    public static void Calculat()
    {
        int result=0;
        int num=70;
        ArrayList<Integer> theFinalarrlist = new ArrayList<>();
        int lresult = 0;
        int a=0;
        int b=0;
        Scanner s1 = new Scanner(System.in);
        do {
            System.out.println("please choose one of flowing options:\n" +
                    "Enter 0 to Quite\n" +
                    "Enter 1 to addition the numbers\n" +
                    "Enter 2 to subtraction the numbers\n" +
                    "Enter 3 to multiplication the numbers\n" +
                    "Enter 4 to division the numbers\n" +
                    "Enter 5 to modulus the numbers\n" +
                    "Enter 6 to find minimum number\n" +
                    "Enter 7 to find maximum number\n" +
                    "Enter 8 to find the average of numbers\n" +
                    "Enter 9 to print the last result in calculator\n" +
                    "Enter 10 to print the list of all results in calculator");
            try {
                num = s1.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("your entry is not correct");
                Calculat();
            }
            switch (num) {
                case 0:
                    break;
                case 1:
                    System.out.println("please enter tow numbers");
                    try {
                        a = s1.nextInt();
                        b = s1.nextInt();
                    }catch(InputMismatchException e)
                    {
                        System.out.println("Error, Please enter Numeric value");
                        Calculat();
                    }
                     result = addition(a,b);
                    System.out.println("the result of addition = " + result);
                    lresult = result;
                    theFinalarrlist.add(result);
                    break;
                case 2:
                    System.out.println("please enter tow numbers");
                    try {
                        System.out.println("enter the first number : ");
                        a = s1.nextInt();
                        System.out.println("enter the second number : ");
                        b = s1.nextInt();
                    }catch(InputMismatchException e)
                    {
                        System.out.println("Error, Please enter Numeric value");
                        Calculat();
                    }
                    result = substruction(a, b);
                    System.out.println("the result of substruction = " + result);
                    lresult = result;
                    theFinalarrlist.add(result);
                    break;
                case 3:
                    System.out.println("please tow numbers");
                    try {
                        System.out.println("enter the first number : ");
                        a = s1.nextInt();
                        System.out.println("enter the second number : ");
                        b = s1.nextInt();
                    }catch(InputMismatchException e)
                    {
                        System.out.println("Error, Please enter Numeric value");
                        Calculat();
                    }
                    result = multiplication(a, b);
                    System.out.println("the result of multiplication = " + result);
                    lresult = result;
                    theFinalarrlist.add(result);
                    break;
                case 4:
                    System.out.println("please tow numbers");
                    try {
                        System.out.println("enter the first number : ");
                        a = s1.nextInt();
                        System.out.println("enter the second number : ");
                        b = s1.nextInt();
                        result = division(a, b);
                    }catch(InputMismatchException e)
                    {
                        System.out.println("Error, Please enter Numeric value");
                        Calculat();
                    }catch (ArithmeticException e)
                    {
                        System.out.println("division by zero not allowed");
                        Calculat();
                    }
                    System.out.println("the result of division = " + result);
                    lresult = result;
                    theFinalarrlist.add(result);
                    break;
                case 5:
                    System.out.println("please enter tow numbers");
                    try {
                        System.out.println("enter the first number : ");
                        a = s1.nextInt();
                        System.out.println("enter the second number : ");
                        b = s1.nextInt();
                    result = modulus(a, b);
                    }catch(InputMismatchException e) {
                        System.out.println("Error, Please enter Numeric value");
                        Calculat();
                    }catch (ArithmeticException e) {
                        System.out.println("modulus by zero not allowed");
                        Calculat();
                    }
                    System.out.println("the result of modulus = " + result);
                    lresult = result;
                    theFinalarrlist.add(result);
                    break;
                case 6:
                    System.out.println("please enter tow numbers");

                    try {
                        System.out.println("enter the first number : ");
                        a = s1.nextInt();
                        System.out.println("enter the second number : ");
                        b = s1.nextInt();
                        result = min(a, b);
                    }catch (IOException e)
                    {
                        System.out.println(e.getMessage());
                        Calculat();
                    }catch(InputMismatchException e)
                    {
                        System.out.println("Error, Please enter Numeric value");
                        Calculat();
                    }
                    System.out.println("the minimum number is : " + result);
                    lresult = result;
                    theFinalarrlist.add(result);
                    break;
                case 7:
                    System.out.println("please enter tow numbers");
                    try {
                        System.out.println("enter the first number : ");
                        a = s1.nextInt();
                        System.out.println("enter the second number : ");
                        b = s1.nextInt();
                        result = max(a, b);
                    }catch (IOException e)
                    {
                        System.out.println(e.getMessage());
                        Calculat();
                    } catch(InputMismatchException e)
                    {
                        System.out.println("Error, Please enter Numeric value");
                        Calculat();
                    }
                    System.out.println("the maximum number is : " + result);
                    lresult = result;
                    theFinalarrlist.add(result);
                    break;
                case 8:
                    System.out.println("please enter tow numbers");
                    try {
                        System.out.println("enter the first number : ");
                        a = s1.nextInt();
                        System.out.println("enter the second number : ");
                        b = s1.nextInt();
                    }catch(InputMismatchException e)
                    {
                        System.out.println("Error, Please enter Numeric value");
                        Calculat();
                    }
                    result = average(a, b);
                    System.out.println("the average of tow numbers = " + result);
                    lresult = result;
                    theFinalarrlist.add(result);
                    break;
                case 9:
                    System.out.println("the last result in calculator= " + lresult);
                    break;
                case 10:
                    System.out.println("the list of all results in calculator :\n" + theFinalarrlist);
                    break;
                default:
                    System.out.println("please Choose from options only");
                    Calculat();
            }

        } while (num != 0);
    }

    public static void main(String[] args) {
         Calculat();
        }}




