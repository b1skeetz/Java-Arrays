import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[4];
        array1 = Functions.init(array1, 50);
        Functions.show("Первый массив:", array1);
        int[] array2 = new int[6];
        array2 = Functions.init(array2, 50);
        Functions.show("Второй массив:", array2);

        double average = Functions.average(array1);
        System.out.println("Среднее значение массива = " + average);

        array1 = Functions.reverse(array1);
        Functions.show("Перевернутый массив:", array1);

        int[] concat = Functions.concat(array1, array2);
        Functions.show("Конкатенация 1 вариант:", concat);

        int[] concat2 = Functions.concatAll(array1, array2);
        Functions.show("Конкатенация 2 вариант:", concat2);
    }
}