class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for (String word:strs) {

            char[] arr= word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(word);
        }

        return new ArrayList<>(hm.values());
    }
}