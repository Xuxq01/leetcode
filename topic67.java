class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int len = (a.length() > b.length()) ? a.length() : b.length();
        int num = 0;
        for(int i = 0; i < len; i++){
            int num1 = i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            int num2 = i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            num = num + num1 + num2;
            sb.insert(0,num % 2);
            num = num / 2;
        }
        if(num == 1){
            sb.insert(0,"1");
        }
        return sb.toString();
    }
}
