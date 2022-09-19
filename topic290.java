class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || s == null) return false;
        String[] string = s.split(" ");
        if(pattern.length() != string.length) return false;
        HashMap<Character,String> map = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(string[i])) return false;
            }
            else{
                if (map.containsValue(string[i])){
                    return false;
                }
                else{
                    map.put(c,string[i]);
                } 
            }
        }
        return true;
    }
}
