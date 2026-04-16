class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder result = new StringBuilder();
        char[] map = new char[26];
        char ch = 'a';  
        for (char c : key.toCharArray()) {
            if (c != ' ' && map[c - 'a'] == 0) {
                map[c - 'a'] = ch++;
            }
        }
         for (char c : message.toCharArray()) {
            if (c == ' ') result.append(' ');
            else result.append(map[c - 'a']);
        }
        return result.toString();

    }
}