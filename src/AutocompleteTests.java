import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AutocompleteTests {
    private List<String> words() {
        return new ArrayList<String>(
                Arrays.asList(
                        "hello",
                        "high",
                        "seattle",
                        "seatac",
                        "see",
                        "hollow",
                        "how"));
    }

    @Test
    public void test() {

    }



}
