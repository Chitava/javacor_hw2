package Task1;

/**Доделать сортировку подсчетом с урока (если нет, реализовать) классическим способом через промежуточный массив
 (см. последние минут 10 семинара)
 **/

public class task1 {
    public static int findMin (int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


    public static int findMax (int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static int[] fillArrayZerro (int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        return array;
    }

    public static int[] fillCountingArray (int[] array){
        int min = findMin(array);
        int max = findMax(array);
        int lengthCountingArray = max + Math.abs(min) + 1;
        int[] countingArray = new int[lengthCountingArray];
        countingArray = fillArrayZerro(countingArray);
        for (int i = 0; i < array.length; i++) {
            int indexElementOfCountingArray = Math.abs(min) + array[i];
            countingArray[indexElementOfCountingArray]++;
        }
        return countingArray;
    }

    public static int[] countingSort (int[] array) {
        int min = findMin(array);
        int[] countingArray = fillCountingArray(array);
        int[] sortedArray = new int[array.length];
        int indexElementOfSortedArray = 0;
        for (int i = 0; i < countingArray.length; i++) {
            int quantity = countingArray[i];
            int data = i + min;
            for (int j = 0; j < quantity; j++) {
                sortedArray[indexElementOfSortedArray] = data;
                indexElementOfSortedArray++;
            }
        }
        return sortedArray;
    }

}



