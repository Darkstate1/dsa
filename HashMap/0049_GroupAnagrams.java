import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap where:
        // Key = sorted version of a word
        // Value = list of all words with that sorted form
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            // Convert the word into a character array
            // Example: "eat" -> ['e','a','t']
            char[] chars = word.toCharArray();

            // Sort the characters
            // ['e','a','t'] -> ['a','e','t']
            Arrays.sort(chars);

            // Convert the sorted characters back into a String
            // ['a','e','t'] -> "aet"
            String key = new String(chars);

            // If this sorted word isn't already a key,
            // create a new list for it
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the ORIGINAL word to the list corresponding
            // to its sorted key
            map.get(key).add(word);
        }

        // Return all the grouped lists.
        // map.values() returns only the values (the lists), not the keys.
        return new ArrayList<>(map.values());
    }
}