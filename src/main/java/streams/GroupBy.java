package streams;


import java.util.*;
import java.util.stream.Collectors;

public class GroupBy {

    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(person->person.getNationality()));
    }

    public static Map<String, List<Person>> groupByNationality2(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            if (!map.containsKey(person.getNationality())) {
                map.put(person.getNationality(), new ArrayList<>());
            }
            map.get(person.getNationality()).add(person);
        }
        return map;
    }

}
