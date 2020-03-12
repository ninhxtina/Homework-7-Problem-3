/**
 * (https://stackoverflow.com/questions/35066881/autocomplete-using-a-trie-in-java)
 * (https://www.geeksforgeeks.org/trie-insert-and-search/)
 * (https://www.lavivienpost.com/autocomplete-with-trie-code/)
 *
 */

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Autocomplete {
    char data;
    LinkedList <Autocomplete> children;
    Autocomplete parent;
    boolean isEnd;

    public Autocomplete(char c) {
        data = c;
        children = new LinkedList<Autocomplete>();
        isEnd = false;
    }

    public Autocomplete getChild(char c) {
        if(children !=null) {
            for(Autocomplete eachChild : children) {
                if(eachChild.data == c) {
                    return eachChild;
                }
            }
        }
        return null;

    }

    protected List getWords() {
        List<String> list = new ArrayList<String>();
        if(isEnd) {
            list.add(toString());
        }

        if(children != null) {
            for(int i = 0; i < children.size(); i++) {
                if(children.get(i) != null) {
                    list.addAll(children.get(i).getWords());
                }
            }
        }
        return list;
    }

    public String toString() {
        if(parent == null) {
            return "";
        } else {
            return parent.toString() + new String(new char[] {data});
        }
    }

     static class AutocompleteTrie {
        private Autocomplete root;

        public AutocompleteTrie() {
            root = new Autocomplete(' ');
        }

        public void insert(String word) {
            if(search(word) == true) {
                return;
            }

            Autocomplete current = root;
            Autocomplete pre;
            for(char ch : word.toCharArray()) {
                pre = current;
                Autocomplete child = current.getChild(ch);
                if(child != null) {
                    current = child;
                    child.parent = pre;
                } else {
                    current.children.add(new Autocomplete(ch));
                    current = current.getChild(ch);
                    current.parent = pre;
                }
            }
            current.isEnd = true;
        }

        public boolean search(String word) {
            Autocomplete current = root;
            for(char ch : word.toCharArray()) {
                if(current.getChild(ch) == null) {
                    return false;
                } else {
                    current = current.getChild(ch);
                }
            }
            if(current.isEnd == true) {
                return true;
            }
            return false;
        }

        public List<String> complete(String prefix) {
            Autocomplete lastNode = root;
            for(int i = 0; i < prefix.length(); i++) {
                lastNode = lastNode.getChild(prefix.charAt(i));
                if(lastNode == null) {
                    return new ArrayList<String>();
                }
            }
            return lastNode.getWords();
        }

    }



}
