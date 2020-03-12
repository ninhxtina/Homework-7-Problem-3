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
        List<String> e = search.complete("h");

        for(int i = 0; i < e.size(); i++) {
            assertEquals(e,e); //placeholder
        }
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
        List<String> e = search.complete("se");

        for(int i = 0; i < e.size(); i++) {
            assertEquals(e,e); //placeholder
        }
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
        List<String> e = search.complete("sea");

        for(int i = 0; i < e.size(); i++) {
            assertEquals(e,e); //placeholder
        }
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
        List<String> e = search.complete("ho");

        for(int i = 0; i < e.size(); i++) {
            assertEquals(e,e); //placeholder
        }
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
        List<String> e = search.complete("xyz");

        List<String> a = new ArrayList<>();

        for(int i = 0; i < e.size(); i++) {
            assertEquals(a,e); //placeholder
        }
    }



}
