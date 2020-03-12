import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AutocompleteTests {


    @Test
    public void testOne() {
        Autocomplete.AutocompleteTrie search = new Autocomplete.AutocompleteTrie();
        search.insert("hello");
        search.insert("high");
        search.insert("seattle");
        search.insert("seatac");
        search.insert("see");
        search.insert("hollow");
        search.insert("how");
        //goes through the search for the actual result
        List<String> a = search.complete("h");
        //create the expected list
        List<String> e = new ArrayList<>();
        e.add("hello");
        e.add("high");
        e.add("hollow");
        e.add("how");
        //compare the two lists
        assertEquals(e,a);
    }

    @Test
    public void testTwo() {
        Autocomplete.AutocompleteTrie search = new Autocomplete.AutocompleteTrie();
        search.insert("hello");
        search.insert("high");
        search.insert("seattle");
        search.insert("seatac");
        search.insert("see");
        search.insert("hollow");
        search.insert("how");
        //goes through the search for actual
        List<String> a = search.complete("se");
        //create expected list
        List<String> e = new ArrayList<>();
        e.add("seattle");
        e.add("seatac");
        e.add("see");
        //compare the two lists
        assertEquals(e,a);
    }

    @Test
    public void testThree() {
        Autocomplete.AutocompleteTrie search = new Autocomplete.AutocompleteTrie();
        search.insert("hello");
        search.insert("high");
        search.insert("seattle");
        search.insert("seatac");
        search.insert("see");
        search.insert("hollow");
        search.insert("how");
        //goes through the search for actual
        List<String> a = search.complete("sea");
        //create expected list
        List<String> e = new ArrayList<>();
        e.add("seattle");
        e.add("seatac");
        //compare the two lists
        assertEquals(e,a);
    }

    @Test
    public void testFour() {
        Autocomplete.AutocompleteTrie search = new Autocomplete.AutocompleteTrie();
        search.insert("hello");
        search.insert("high");
        search.insert("seattle");
        search.insert("seatac");
        search.insert("see");
        search.insert("hollow");
        search.insert("how");
        //goes through the search for actual
        List<String> a = search.complete("ho");
        //create expected list
        List<String> e = new ArrayList<>();
        e.add("hollow");
        e.add("how");
        //compare the two lists
        assertEquals(e,a);
    }

    @Test
    public void testNone() {
        Autocomplete.AutocompleteTrie search = new Autocomplete.AutocompleteTrie();
        search.insert("hello");
        search.insert("high");
        search.insert("seattle");
        search.insert("seatac");
        search.insert("see");
        search.insert("hollow");
        search.insert("how");
        //search for actual results
        List<String> a = search.complete("xyz");
        //expected should be an empty list
        List<String> e = new ArrayList<>();
        //compare the lists
        assertEquals(e,a);
    }

}
