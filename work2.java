//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
package HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int N = Integer.parseInt(scanner.next());
        scanner.close();
        ArrayList<Integer> list = randomArray(N);
        System.out.println("Список: " + list);
        double arithmetic = minMax(list);
        System.out.println("Среднее арифметическое: " + arithmetic);
    }

    public static ArrayList<Integer> randomArray(int N) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(0, 1000));
        }
        return list;
    }

    public static double minMax(ArrayList list) {
        double sum = 0;
        double arithmetic = 0;
        int max = (int) Collections.max(list);
        int min = (int) Collections.min(list);
        for (int i = 0; i < list.size(); i++) {
            sum += (int) list.get(i);
        }
        arithmetic = sum / list.size();
        System.out.println("Минимальное значение: " + min + "\n" + "Максимальное значение: " + max + "\n");

        return arithmetic;
    }


}

