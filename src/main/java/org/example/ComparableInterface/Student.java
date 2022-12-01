package org.example.ComparableInterface;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastname;
    private int index;

    public Student(String firstName, String lastname, int index) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.index = index;
    }

    @Override
    public String toString() {
        return "\n Student{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", index=" + index +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (lastname.compareTo(o.lastname) == 0) {
            if ((firstName.compareTo(o.firstName) == 0)) {
                return index - o.index;
            } else {
                return (firstName.compareTo(o.firstName));
            }
        }
        return lastname.compareTo(o.lastname);
    }
}

