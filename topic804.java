class Solution {
    public static final String[] MORSE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                                      "....", "..", ".---", "-.-", ".-..", "--", "-.",
                                      "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                                      "...-", ".--", "-..-", "-.--", "--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for(String word:words){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                sb.append(MORSE[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
