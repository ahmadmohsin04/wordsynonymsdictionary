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
    public static void main(String[] args)  {
    }
}
