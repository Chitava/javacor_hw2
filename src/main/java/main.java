import Task1.task1;
import Task2.CeaserCipher;
import Task3.task3;
import java.util.Scanner;

public class main {
        public static void main(String[] args) {
                /*Задача № 1*/
//            int[] array = {2,6,-2,0,15,2,6,6,10,-2,-2};
//            int[] sortedArray = task1.countingSort(array);
//            for (int val: sortedArray) {
//                System.out.print(val+ ", ");
//            }
                /*Задача № 2*/
//            System.out.println("Что делаем? Шифруем - нажми 1, дешифруем - нажми 2");
//            Scanner scan = new Scanner(System.in);
//            int choise = scan.nextInt();
//            switch (choise) {
//                case 1:{
//                    System.out.print("Введите фразу -->");
//                    scan = new Scanner(System.in);
//                    String message = scan.nextLine();
//                    System.out.print("Введите ключ шифрования -->"); //Количество знаков смещения
//                    scan = new Scanner(System.in);
//                    int key = scan.nextInt();
//                    String cipherMessage = String.valueOf(CeaserCipher.cipher(message, key));
//                    System.out.println(cipherMessage);
//                    break;
//                }
//                case 2:{
//                    System.out.print("Введите фразу -->");
//                    scan = new Scanner(System.in);
//                    String message = scan.nextLine();
//                    System.out.print("Введите ключ шифрования -->"); //Количество знаков смещения
//                    scan = new Scanner(System.in);
//                    int key = scan.nextInt();
//                    String cipherMessage = String.valueOf(CeaserCipher.dicipher(message, key));
//                    System.out.println(cipherMessage);
//                    break;
//                }
//            }
                /*Задача № 3*/
                int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                int[] offsetArray = Task3.task3.offsetarray(array, 4);
                for (int val : array) {
                    System.out.print(val+ ", ");
                }
                System.out.println("\n");
                for (int val : offsetArray) {
                        System.out.print(val+ ", ");
                }
                }


        }



