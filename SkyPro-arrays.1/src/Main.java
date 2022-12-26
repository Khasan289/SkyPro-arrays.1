import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1

        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        int[] thirdArray = {1, 2, 3, 4, 5, 6};

        task2();
        task3();
        task4();

    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        int[] thirdArray = {1, 2, 3, 4, 5, 6};
        // подзадача 1
        for (int i = 0; i < firstArray.length; i++) {
            if (i == firstArray.length - 1) {
                System.out.print(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i] + ", ");
        }
        System.out.println();

        // подзадача 2

        for (int i = 0; i < secondArray.length; i++) {
            if (i == secondArray.length - 1) {
                System.out.print(secondArray[i]);
                break;
            }
            System.out.print(secondArray[i] + ", ");
        }
        System.out.println();

        //подзадача 3

        for (int i = 0; i < thirdArray.length; i++) {
            if (i == thirdArray.length - 1) {
                System.out.print(thirdArray[i]);
                break;
            }
            System.out.print(thirdArray[i] + ", ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");


        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        int[] thirdArray = {1, 2, 3, 4, 5, 6};

        // Подзадача 1

        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i] + ", ");
        }
        System.out.println();

        // Подзадача 2

        for (int i = secondArray.length - 1; i >= 00; i--) {
            if (i == 0) {
                System.out.print(secondArray[i]);
                break;
            }
            System.out.print(secondArray[i] + ", ");
        }
        System.out.println();

        // Подзадача 3

        for (int i = thirdArray.length - 1; i >= 00; i--) {
            if (i == 0) {
                System.out.print(thirdArray[i]);
                break;
            }
            System.out.print(thirdArray[i] + ", ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");

        int[] firstArray = new int[]{1, 2, 3};
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i]++;
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(firstArray[i]);
        }
        System.out.println();
    }
}






