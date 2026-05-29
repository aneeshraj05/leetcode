import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        HashMap<String, Integer> map = new HashMap<>();
        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        for (String s : paragraph.split("\\s+")) {
            if (!ban.contains(s)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        String ans = "";
        int max = 0;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }

        return ans;
    }
}