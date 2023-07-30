import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class Exercise7 {
    // 7.Write a menu driven Java program with following option:
    public static void ArrayOptions() {
        int num=0;
        int num1;
        int size=0;
        int[] list;
        Scanner s2 = new Scanner(System.in);
        try {
            System.out.println("please enter the size of array");
            size = s2.nextInt();
        }catch (InputMismatchException e)
        {
            System.out.println("Error please enter Numerical value");
            ArrayOptions();
        }
        list=new int [size];
        do {
            System.out.println("please enter number from menue\n1.Accept elements of an array\n2.Display elements of an array\n3.Search the element within array\n4.Sort the array\n5.To Stop");
            try {
                num = s2.nextInt();
                if (num>5||num==0)
                throw new IOException("Choose number from option only");
            }catch (InputMismatchException e)
            {
                System.out.println("Error please enter Numerical value");
                ArrayOptions();
            }catch (IOException e)
            {
                e.getMessage();
            }
            if (num == 1) {
                System.out.println("please enter integer as elements of array");
                for (int u = 0; u < list.length; u++) {
                    try {
                        num1 = s2.nextInt();
                        list[u] = num1;
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Error please enter Numerical value");
                        ArrayOptions();
                    }
                }
            } else if (num == 2) {
                System.out.println("the Array :" + Arrays.toString(list));
            } else if (num == 3) {
                int ese = 0;
                System.out.println("please enter element to Search it  within array");
                try {
                    ese = s2.nextInt();
                    int flag = 0;
                    for (int x = 0; x < size; x++) {
                        if (list[x] == ese) {
                            flag = 1;
                            break;
                        } else {
                            flag = 0;
                        }
                    }
                    if (flag == 1) {
                        System.out.println(ese + " is found in array ");
                    } else {
                        System.out.println(ese + " is not found in array ");
                    }
                }catch (InputMismatchException e) {
                System.out.println("Error please enter Numerical value");
                ArrayOptions();
            }

            } else if (num == 4) {
                System.out.println(" the Array before sorting : " + Arrays.toString(list));
                for (int i = 0; i < list.length; i++) {
                    for (int j = i + 1; j < list.length; j++) {
                        int tmp = 0;
                        if (list[i] > list[j]) {
                            tmp = list[i];
                            list[i] = list[j];
                            list[j] = tmp;
                        }
                    }
                }
                System.out.println(" the Array after sorting : " + Arrays.toString(list));
            } else if (num == 5) {
                break;
            } else {
                System.out.println("the number from menu it's onlly allowed ");
            }

        } while (num != 5);
    }

    public static void main(String[] args)
    {
        ArrayOptions();
    }
}
