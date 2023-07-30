import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Project1_Exeptions {

        //هذي Array عشان احفظ فيها كل اختيارات اليوزر والكومبيوتر لأجل أن اتأكد ان الكوبيوتر ما يختارها مره ثانيه
        static ArrayList<Integer> ucch = new ArrayList<Integer>();
        //هنا هذي الميثود مسؤوله عن اختيار الكومبيوتر خانه عشوائيه عشان يحط Xاو O
        public static int randomly_Choose() {
            int randomIndex = 0;
            Random random = new Random();
            do {
                randomIndex = random.nextInt(9);
            } while (Search(randomIndex)||randomIndex==0);
            return randomIndex;
        }


        //هنا هذي الميذود تتأكد إذا computer اختار رقم سبق اختياره من قبلuser او من قبله هو
        public static boolean Search(int num) {
            if(ucch.contains(num))
                return true;
            else return false;
        }

        public static String[][] Computerchos(String[][] arr) {
            int randomIndex = randomly_Choose();
            ucch.add(randomIndex);
            System.out.println("Computer Choose " + randomIndex);
            int i = 0;
            int j = 0;
            switch (randomIndex) {
                case 1:
                    i = 0;
                    j = 0;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "O";
                    }
                    break;
                case 2:
                    i = 0;
                    j = 2;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "O";
                    }
                    break;
                case 3:
                    i = 0;
                    j = 4;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "O";
                    }
                    break;
                case 4:
                    i = 2;
                    j = 0;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "O";
                    }
                    break;
                case 5:
                    i = 2;
                    j = 2;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "O";
                    }
                    break;
                case 6:
                    i = 2;
                    j = 4;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "O";
                    }
                    break;
                case 7:
                    i = 4;
                    j = 0;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "O";
                    }
                    break;
                case 8:
                    i = 4;
                    j = 2;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "O";
                    }
                    break;
                case 9:
                    i = 4;
                    j = 4;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "O";
                    }
                    break;
            }
            return arr;
        }
        public static String[][]Userchos(String[][] arr)
        {
            int num=0;
            Scanner s1 = new Scanner(System.in);
            System.out.println("where would you like to play (1-9)");
            try {
                num = s1.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Please enter a Numerical value from 1-9");
            }
            try {
                if(Search(num)){
                    throw new IOException("please choose another place");
                }
            }catch(IOException e)
            {
                e.getMessage() ;
                Userchos(arr);
            }
            ucch.add(num);
            int i=0;
            int j=0;
            switch (num) {
                case 1:
                    i = 0;
                    j = 0;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "X";
                    }
                    break;
                case 2:
                    i = 0;
                    j = 2;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "X";
                    }
                    break;
                case 3:
                    i = 0;
                    j = 4;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "X";
                    }
                    break;
                case 4:
                    i = 2;
                    j = 0;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "X";
                    }
                    break;
                case 5:
                    i = 2;
                    j = 2;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "X";
                    }
                    break;
                case 6:
                    i = 2;
                    j = 4;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "X";
                    }
                    break;
                case 7:
                    i = 4;
                    j = 0;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "X";
                    }
                    break;
                case 8:
                    i = 4;
                    j = 2;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "X";
                    }
                    break;
                case 9:
                    i = 4;
                    j = 4;
                    if (Is_empty(i, j, arr)) {
                        arr[i][j] = "X";
                    }
                    break;
                default: System.out.println("please choose number from 1-9");
                    Userchos(arr);
            }
            return arr;
        }
        public static boolean check_FDaigo(String arr[][],String x) {
            int digonal=0;
            for (int i = 0; i < 5; i++) {
                for(int j=0;j<5;j++) {
                    if(i==j)
                        if (arr[i][j]==x)
                            digonal++;
                }
            }
            if(digonal==3)
                return true;
            else return false;
        }
        public static boolean check_SDaigo(String arr[][],String x) {
            int digonal=0;
            for (int i = 0; i < 5; i++) {
                for(int j=0;j<5;j++) {
                    if((i + j) == (5 - 1))
                        if(arr[i][j]==x)
                            digonal++;

                }
            }
            if(digonal==3)
                return true;
            else return false;
        }
        public static boolean check_rows(String arr[][],String x) {
            for (int i = 0; i < 5; i++) {
                int row=0;
                for(int j=0;j<5;j++) {
                    if (arr[i][j]==x)
                        row++;
                }
                if(row==3)
                    return true;
            }
            return false;
        }
        public static boolean check_colum(String arr[][],String x) {

            for (int j = 0; j < 5; j++) {
                int col = 0;
                for (int i = 0; i < 5; i++) {

                    if (arr[i][j] == x)
                        col++;
                }
                if (col == 3)
                    return true;
            }
            return false;
        }
        public static boolean UserIs_win(String arr[][])
        {
            if(check_FDaigo(arr,"X"))
                return true;
            else if(check_SDaigo(arr,"X"))
                return true;
            else if(check_rows(arr,"X"))
                return true;
            else if (check_colum(arr,"X"))
                return true;
            else
                return false;
        }
        public static boolean ComputerIs_win(String arr[][])
        {
            if(check_FDaigo(arr,"O"))
                return true;
            else if(check_SDaigo(arr,"O"))
                return true;
            else if(check_rows(arr,"O"))
                return true;
            else if (check_colum(arr,"O"))
                return true;
            else
                return false;
        }
        public static boolean Is_empty(int l,int m,String arr[][]) {
            if (arr[l][m] == " ")
                return true;
            else return false;
        }
        public static void arrayprint(String[][] arr){
            for(int i=0;i<5;i++)
            {
                for(int j=0 ;j<5;j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }

        }
        public static boolean Searcharray(String[][] arr) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (arr[i][j] == " ")
                        return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            String[][] arr1 = {{" ", " | ", " ", " | ", " "}, {"-", "+", "-", "+", "-+-"}, {" ", " | ", " ", " | ", " "}, {"-", "+", "-", "+", "-+-"}, {" ", " | ", " ", " | ", " "}};
            arrayprint(arr1);
            do {
                arr1 = Userchos(arr1);
                arrayprint(arr1);
                if (UserIs_win(arr1)) {
                    System.out.println("the user is win");
                    break;
                }
                arr1 = Computerchos(arr1);
                arrayprint(arr1);
                if (ComputerIs_win(arr1)) {
                    System.out.println("the Computer is win");
                    break;
                }
                if(Searcharray(arr1)==false){
                    System.out.println("No one win");
                    break;}
            }while(ComputerIs_win(arr1)!=true&&UserIs_win(arr1)!=true);
        }
}
