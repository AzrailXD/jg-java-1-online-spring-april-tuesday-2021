package students.dmitrijs_matrenicevs.lesson_4.level_3.task_9;

import java.util.Scanner;

class Task9 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();
        System.out.print("Введите трерье целое число: ");
        int c = scanner.nextInt();

        if (a >= b && a > c) {
            System.out.print("Самое большое число: " + a);
        }
        else if (b >= a && b > c) {
            System.out.print("Самое большое число: " + b);
        }
        else {
            System.out.print("Самое большое число: " + c);
        }
    }
}
