import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] intArray = new int[] {1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        short[] shortArray = new short[10];
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] intArray = new int[] {1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        short[] shortArray = new short[10];
        for (int i = 0; i < intArray.length; i++) {
            if(i == intArray.length - 1) {
                System.out.println(intArray[intArray.length - 1]);
                break;
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }
        for (int i = 0; i < doubleArray.length; i++) {
            if(i == doubleArray.length - 1) {
                System.out.println(doubleArray[doubleArray.length - 1]);
                break;
            } else {
                System.out.print(doubleArray[i] + ", ");
            }
        }
        for (int i = 0; i < shortArray.length; i++) {
            if(i == shortArray.length - 1) {
                System.out.println(shortArray[shortArray.length - 1]);
                break;
            } else {
                System.out.print(shortArray[i] + ", ");
            }
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] intArray = new int[] {1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        short[] shortArray = new short[10];
        for (int i = intArray.length - 1; i >= 0; i--) {
            if(i == 0) {
                System.out.println(intArray[0]);
                break;
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            if(i == 0) {
                System.out.println(doubleArray[0]);
                break;
            } else {
                System.out.print(doubleArray[i] + ", ");
            }
        }
        for (int i = shortArray.length - 1; i >= 0; i--) {
            if(i == 0) {
                System.out.println(shortArray[0]);
                break;
            } else {
                System.out.print(shortArray[i] + ", ");
            }
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] intArray = new int[] {1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        short[] shortArray = new short[10];
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] % 2 != 0) {
                intArray[i] = intArray[i] + 1;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}