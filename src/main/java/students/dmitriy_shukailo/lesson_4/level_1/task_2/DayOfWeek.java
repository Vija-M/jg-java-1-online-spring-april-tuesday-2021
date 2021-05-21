package students.dmitriy_shukailo.lesson_4.level_1.task_2;

import java.util.Scanner;

 class DayOfWeek {

     public static void main(String[] args) {
         System.out.print("Enter a Number from 1 till 7: ");

         Scanner scanner = new Scanner(System.in);
         int number = scanner.nextInt();

         switch (number) {
             case 1:System.out.println("Monday");
                break;
             case 2:System.out.println("Tuesday");
                break;
             case 3:System.out.println("Wednesday");
                 break;
             case 4:System.out.println("Thursday");
                 break;
             case 5:System.out.println("Friday");
                 break;
             case 6:System.out.println("Saturday");
                 break;
             case 7:System.out.println("Sanday");
                 break;




         /*case 2: System.out.println(“Tuesday”); break;
         case 3: System.out.println(“Wednesday”); break;
         case 4: System.out.println(“Thursday”); break;
         case 5: System.out.println(“Friday”); break;
         case 6: System.out.println(“Saturday”); break;
         default : System.out.println(“Sanday”); break;*/
         }

     }
 }