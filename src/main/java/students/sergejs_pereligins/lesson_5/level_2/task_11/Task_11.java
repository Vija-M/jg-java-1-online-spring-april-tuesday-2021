package students.sergejs_pereligins.lesson_5.level_2.task_11;

import java.util.Random;
import java.util.Scanner;

  class Task11{
      public static void main(String[] args) {
          int[]numbers= new int[3];

          Scanner scanner  = new Scanner(System.in);

          int[] array = new int[3];

          for (int i = 0; i < array.length; i++) {
              System.out.println("enter number "+(i+1)+":");
              array[i] = scanner.nextInt();
          }
              for (int i =0; i<array.length; i++){
              System.out.println("arraynumber "+i+ ": "+array[i]);
          }

      }}