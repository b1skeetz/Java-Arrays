import java.util.Random;

public class Functions {
    private static Random rand = new Random();
    public static void swap(int[] array, int num1, int num2){
        int buf = array[num1];
        array[num1] = array[num2];
        array[num2] = buf;
    }
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] < array[j]){
                    swap(array, i, j);
                }
            }
        }
    }
    public static int[] concatAll(int[] array1, int[] array2){
        int globalLength = array1.length + array2.length;
        int[] concatArray = new int[globalLength];
        for(int i = 0; i < array1.length; i++){
            concatArray[i] = array1[i];
        }
        for(int i = array1.length, j = 0; i < globalLength || j < array2.length; i++, j++){
            concatArray[i] = array2[j];
        }
        sort(concatArray);
        return concatArray;
    }
    public static int[] concat(int[] array1, int[] array2){
        int globalLength = array1.length + array2.length;
        int[] concatArray = new int[globalLength];
        Functions.sort(array1);
        Functions.sort(array2);
        for(int i = 0; i < array1.length; i++){
            concatArray[i] = array1[i];
        }
        for(int i = array1.length, j = 0; i < globalLength || j < array2.length; i++, j++){
            concatArray[i] = array2[j];
        }
        return concatArray;
    }
    public static int[] reverse(int[] array){
        int[] bufArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            bufArray[i] = array[(array.length-1)-i];
        }
        return bufArray;
    }
    public static double average(int[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }
    public static int[] init(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(100);
        }
        return array;
    }
    public static int[] init(int[] array, int range){
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(range);
        }
        return array;
    }
    public static void show(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void show(String messaage, int[] array){
        System.out.print(messaage + " ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
