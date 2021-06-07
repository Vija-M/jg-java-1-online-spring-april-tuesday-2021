package students.dmitriy_shukailo.lesson_6.level_3.task_12;

import java.util.Scanner;

public class ArrayServiceDemo {

    public static void main(String[] args) {

        ArrayServiceDemo demo = new ArrayServiceDemo();
        demo.shouldCreateArray();
    }

    public void shouldCreateArray() {
        ArrayService arrayService = new ArrayService();

        int[] arr = arrayService.create(15);
        arrayService.fillRandomly(arr);
        arrayService.print(arr);

        System.out.print("Enter number for search:");
        Scanner scanner = new Scanner(System.in);
        int numberToSearch = scanner.nextInt();

        arrayService.contains(arr, numberToSearch);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                System.out.println("Searched number is " + numberToSearch + " and it has element index in array: " + i);
            }
        }
    }

}