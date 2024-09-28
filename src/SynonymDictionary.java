import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SynonymDictionary {

    private HashMap<String, List<String>> synonymMap;

    public SynonymDictionary() {
        synonymMap = new HashMap<>();
    }

    public void insertWord(String word, List<String> synonyms) {
        if (synonymMap.containsKey(word)) {
            synonymMap.get(word).addAll(synonyms);
        } else {
            synonymMap.put(word, new ArrayList<>(synonyms));
        }
        System.out.println("Word \"" + word + "\" added or updated successfully");
    }

    public void searchWord(String word) {
        if (synonymMap.containsKey(word)) {
            List<String> synonyms = synonymMap.get(word);
            System.out.println("Synonyms for \"" + word + "\": " + synonyms);
        } else {
            System.out.println("Word \"" + word + "\" not found in the dictionary");
        }
    }

    public void deleteWord(String word) {
        if (synonymMap.containsKey(word)) {
            synonymMap.remove(word);
            System.out.println("Word \"" + word + "\" removed from the dictionary.");
        } else {
            System.out.println("Word \"" + word + "\" not found.");
        }
    }
    public static void main(String[] args)  {
    }
}
