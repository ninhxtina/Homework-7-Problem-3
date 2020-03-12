import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AutocompleteTests {
    public static void main(String[] args) {
        Autocomplete.AutocompleteTrie search = new Autocomplete.AutocompleteTrie();
        search.insert("hello");
        search.insert("high");
        search.insert("seattle");
        search.insert("seatac");
        search.insert("see");
        search.insert("hollow");
        search.insert("how");
        List<String> a = search.complete("h");
        for(int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

    }

    @Test
    public void test() {

    }



}
