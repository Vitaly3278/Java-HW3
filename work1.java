//Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
package HW3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int N = Integer.parseInt(scanner.next());
        scanner.close();
        ArrayList<Integer> list = randomArray(N);
        ArrayList newList = remove(list);
        System.out.println(newList);
    }

    public static ArrayList<Integer> randomArray(int N) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(0, 11));
        }
        return list;
    }

    public static ArrayList remove(ArrayList list) {
        System.out.println(list);
        for (int i = 0; i < list.size(); i += 2) {
            list.remove(i);
        }
        return list;

    }
}

