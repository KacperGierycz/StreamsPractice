package streams;

import java.util.*;

public class MaxAndComparator {
    public static Person getOldestPerson(List<Person> people) {
        return people.stream().max(Comparator.comparingInt(Person::getAge)).get();
    }

    public static Person getOldestPerson2(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

}
