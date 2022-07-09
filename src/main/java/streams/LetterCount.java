
package streams;

import java.util.Arrays;
import java.util.stream.*;

public class LetterCount {

//Now, starting again from a list of names, give me the total number of letters in all the names with more than 5 letters
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names).mapToInt(name->name.length()).filter(name->name>5).sum();
    }


}
