/** Написать метод, принимающий на вход массив чисел и параметр n. Метод должен осуществить циклический
 ** (последний элемент при сдвиге становится первым) сдвиг всех элементов массива на n позиций;
 **/

package Task3;

public class task3 {
    public static int[] offsetarray (int[] array, int offset){
        int[] offsetArray = new int [array.length];
        for (int i = 0; i < offset ; i++) {
            for (int j = offset-1; j <array.length ; j++) {
                offsetArray[j] = array[i];
                i++;
                }
            }
            for (int i = offset-1; i <array.length; i++) {
                for (int j = 0; j < offset-1; j++) {
                    offsetArray[j] = array[i];
                    if (i < array.length-1){i++;}


                }
            }
        return offsetArray;
            }

    }



