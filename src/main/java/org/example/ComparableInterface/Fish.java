package org.example.ComparableInterface;

public class Fish {
    private String name;
    private int age;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\n Fish{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
