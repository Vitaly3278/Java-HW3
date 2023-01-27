package HW3;
//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
// Пройти по списку из предыдущего задания и удалить повторяющиеся элементы;

import java.util.*;

public class work3 {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<String> solarSystem = new ArrayList<>();
        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        for (int i = 0; i < 50; i++) {
            solarSystem.add(solarSystemPlanets[random.nextInt(0, solarSystemPlanets.length)]);

        }
        System.out.println(solarSystem);
        for (String item : solarSystemPlanets) {
            System.out.println(item + "-" + Collections.frequency(solarSystem, item));
        }
        Set<String> set = new HashSet<>(solarSystem);
        System.out.println(set);
    }

}