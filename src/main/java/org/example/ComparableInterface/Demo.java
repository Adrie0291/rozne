package org.example.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mike", "Kranowski", 33));
        students.add(new Student("Milosz", "Jabecki", 23));
        students.add(new Student("Milosz", "Jabecki", 13));
        students.add(new Student("Milosz", "Jabecki", 19));
        System.out.println(students);
//        List<Integer> numbers = new ArrayList<>(List.of(1,34,12,99,6));
//        System.out.println(numbers);
//        Collections.sort(numbers);
//        System.out.println(numbers);
        Collections.sort(students);
        System.out.println(students);

        List<Fish> fishes = new ArrayList<>(List.of(
                new Fish("pstrag", 2),
                new Fish("halibut", 33),
                new Fish("wieloryb", 19),
                new Fish("jesiotr", 7),
                new Fish("homarek", 22),
                new Fish("halibuv", 22),
                new Fish("halibuw", 22),
                new Fish("halibut", 31),
                new Fish("halibut", 43)));

        Comparator<Fish> fishComparatorByAgeFish = new Comparator<Fish>() {
            @Override
            public int compare(Fish o1, Fish o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Comparator<Fish> fishComparatorByLengthWord = new Comparator<Fish>() {
            @Override
            public int compare(Fish o1, Fish o2) {
                if (o1.getName().length() - o2.getName().length() == 0) {
                    if (o1.getName().compareTo(o2.getName()) == 0) {
                        return o1.getAge() - o2.getAge();
                    } else {
                        return o1.getName().compareTo(o2.getName());
                    }
                } else {
                    return o1.getName().length() - o2.getName().length();
                }
            }
        };
        Comparator<Fish> fishComparatorByAlphabetical = new Comparator<Fish>() {
            @Override
            public int compare(Fish o1, Fish o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println(fishes);
        System.out.println("Sort by Age: ");
        fishes.sort(fishComparatorByAgeFish);
        System.out.println(fishes);

        System.out.println("Sort by Length word: ");
        fishes.sort(fishComparatorByLengthWord);
        System.out.println(fishes);

        System.out.println("Sort by Alphabetical: ");
        fishes.sort((fishComparatorByAlphabetical));
        System.out.println(fishes);
    }

}
