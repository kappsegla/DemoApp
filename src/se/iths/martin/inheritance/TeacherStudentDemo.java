package se.iths.martin.inheritance;

import java.util.Random;

public class TeacherStudentDemo {

    public static void main(String[] args) {

        Person[] persons = {new Teacher("Martin", 40, "Java"),
                new Student("Kalle", 26)};

        for (Person p : persons) {
            System.out.println(p.getName());

            if (p instanceof Student)
                System.out.println(((Student) p).getYhPointsTaken());

        }
    }
}
