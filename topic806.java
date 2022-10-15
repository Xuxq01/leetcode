class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line = 1;
        int width = 0;
        for(int i = 0; i < s.length(); i++){
            int wid = widths[s.charAt(i) - 'a'];
            width += wid;
            if(width > 100){
                line++;
                width = wid;
            }
        }
        return new int[]{line,width};
    }
}
