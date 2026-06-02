class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : words[0].toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

       
        for (int i = 1; i < words.length; i++) {
            HashMap<Character, Integer> temp = new HashMap<>();

            for (char ch : words[i].toCharArray()) {
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            }

            for (char ch = 'a'; ch <= 'z'; ch++) {
                map.put(ch,
                        Math.min(
                            map.getOrDefault(ch, 0),
                            temp.getOrDefault(ch, 0)
                        ));
            }
        }

        List<String> ans = new ArrayList<>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = map.getOrDefault(ch, 0);

            while (count-- > 0) {
                ans.add(String.valueOf(ch));
            }
        }

        return ans;
    }
}