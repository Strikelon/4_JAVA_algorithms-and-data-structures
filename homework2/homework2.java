package hmJava3.GrokaemAlgoritms.dz.homewok2;

import java.util.Random;

public class homework2 {

    private static int ARRAY_SIZE = 1000000;
    private static int MAX_RANDOM = 100;

    public static void main(String[] args){

        long timeA = 0, timeB = 0;

        int[] array = new int[ARRAY_SIZE];

        randomInitArray(array);

        printArray(array);

        // Линейный поиск элемента

        int elementSearch = MAX_RANDOM / 2;


        //Линейный поиск элемента
        System.out.println("-------------------------------------------");
        System.out.println("Линейный поиск элемента: " + elementSearch);

        timeA = System.nanoTime();

        System.out.println("Индекс элемента: " + lineSearchValue(array,elementSearch));

        timeB = System.nanoTime();
        System.out.println("Time = " + (timeB - timeA));
        System.out.println("-------------------------------------------");

        //Удаление элемента в массиве

        System.out.println("-------------------------------------------");
        int deleteIndex = ARRAY_SIZE/3;
        System.out.println("Удаление элемента под индексом: " + deleteIndex);
        printArray(array);
        timeA = System.nanoTime();

        deleteValueFromIndex(array, deleteIndex);

        timeB = System.nanoTime();
        System.out.println("Time = " + (timeB - timeA));
        printArray(array);
        System.out.println("-------------------------------------------");

        //Вставка элемента в массив

        System.out.println("-------------------------------------------");
        int insertValue = 15;
        int insertIndex = ARRAY_SIZE/2;
        System.out.println("Вставка элемента: " + insertValue);
        System.out.println("На позицию: " + insertIndex);
        printArray(array);
        timeA = System.nanoTime();

        insetElement(array, insertValue, insertIndex);

        timeB = System.nanoTime();
        System.out.println("Time = " + (timeB - timeA));
        printArray(array);
        System.out.println("-------------------------------------------");

        //Сортировка пузырьком
        System.out.println("-------------------------------------------");
        System.out.println("Сортировка пузырьком");
        printArray(array);
        timeA = System.nanoTime();
        bubleSort(array);
        timeB = System.nanoTime();
        System.out.println("Time = " + (timeB - timeA));
        printArray(array);
        System.out.println("-------------------------------------------");

        randomInitArray(array);

        //Сортировка выбором
        System.out.println("-------------------------------------------");
        System.out.println("Сортировка выбором");
        printArray(array);
        timeA = System.nanoTime();
        selectionSort(array);
        timeB = System.nanoTime();
        System.out.println("Time = " + (timeB - timeA));
        printArray(array);
        System.out.println("-------------------------------------------");

        randomInitArray(array);

        //Сортировка вставкой
        System.out.println("-------------------------------------------");
        System.out.println("Сортировка вставкой");
        printArray(array);
        timeA = System.nanoTime();
        insertionSort(array);
        timeB = System.nanoTime();
        System.out.println("Time = " + (timeB - timeA));
        printArray(array);
        System.out.println("-------------------------------------------");


        //Бинарный поиск элемента
        System.out.println("-------------------------------------------");
        System.out.println("Бинарный поиск элемента: " + elementSearch);
        printArray(array);
        timeA = System.nanoTime();
        System.out.println("Индекс элемента: " + binarySearchValue(array,elementSearch));
        timeB = System.nanoTime();
        System.out.println("Time = " + (timeB - timeA));
        System.out.println("-------------------------------------------");


    }



    //--------Методы для работы с массивом-------------

    //заполннение массива случайными числами
    private static void randomInitArray(int[] array){

        Random random = new Random();
        for(int i = 0; i < array.length; i++){

            array[i] = random.nextInt(MAX_RANDOM);

        }

    }


    //Вывод массива в консоль
    private static void printArray(int[] array){

        for(int i = 0; i < array.length; i++ ){

            System.out.print(array[i] + " ");

        }

        System.out.println();

    }

    //Линейный поиск элемента
    private static int lineSearchValue(int[] array, int value){

        for (int i = 0; i < array.length; i++){

            if(array[i] == value){
                return i;
            }

        }

        return -1;

    }

    //Бинарный поиск элемента
    private static int binarySearchValue(int[] array, int value){

        int low = 0;
        int high = array.length-1;
        int mid;
        while (low <= high){
            mid = low + (high - low)/2;
            if(array[mid] == value){
                return mid;
            }else if(value < array[mid]){
                high = mid-1;
            }else if(value > array[mid]){
                low = mid+1;
            }
        }
        return -1;

    }

    //удаление элемента из массива
    private static void deleteValueFromIndex(int[] array, int index){

        if(index < 0 || index >= array.length){
            throw new IllegalArgumentException("Такой индекс не содержится в массиве");
        }

        for(int i = index; i < array.length -1; i++){

            array[i] = array[i+1];

        }
        array[ARRAY_SIZE - 1] = 0;

    }

    //вставка элемента
    private static void insetElement(int[] array, int value ,int index){

        if(index < 0 || index >= array.length){
            throw new IllegalArgumentException("Такой индекс не содержится в массиве");
        }

        for(int i = array.length-1; i > index; i--){

            array[i] = array[i-1];

        }

        array[index] = value;

    }

    //сортировка пузырьком
    private static void bubleSort(int[] array){

        for(int i = array.length-1; i > 0; i--){

            for(int j = 0; j < i; j++){

                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }

        }

    }

    //сортировка выбором
    private static void selectionSort(int[] array){

        int index;
        for(int i = 0; i < array.length - 1; i++ ){
            index = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[index] > array[j]){
                    index = j;
                }
            }
            if(i != index){
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
    }


    private static void insertionSort(int[] array){

        int value;
        int j;
        for(int i=1; i<array.length; i++){
            value = array[i];
            j = i;
            while (j > 0 && (value < array[j-1])){
                array[j] = array[j-1];
                j--;
            }

            array[j] = value;
        }
    }

}
