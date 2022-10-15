class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int [] slots = new int[26];
        licensePlate = licensePlate.toLowerCase();
        char [] chars = licensePlate.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] > 'z' || chars[i] < 'a')continue;
            slots[chars[i] - 'a'] ++;
        }
        int resIndex = -1;
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].toLowerCase();
            char [] charStr = words[i].toCharArray();
            int [] clone = slots.clone();
            for(int j = 0; j < charStr.length; j++){
                clone[charStr[j] - 'a']--;
                if(j == charStr.length - 1){
                    if(Arrays.stream(clone).max().getAsInt() > 0)break;
                    else{
                        if(resIndex == -1 || words[resIndex].length() > words[i].length())resIndex = i;
                    }
                }
            }
        }
        return words[resIndex];
    }

}
