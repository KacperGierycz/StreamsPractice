package streams;

import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class UpperCase {

    public static Collection<String> mapToUppercase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for(String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    public static Collection<String> mapToUppercaseStream(String... names) {
        return Arrays.stream(names).map(name->name.toUpperCase()).collect(toCollection(ArrayList::new));
    }

}
