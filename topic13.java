/*字符          数值
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             100*/

import java.util.Scanner;

public class topic13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int lNum = count(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = count(s.charAt(i));
            if(lNum < num) {
                sum -= lNum;
            } else {
                sum += lNum;
            }
            lNum = num;
        }
        sum += lNum;
        return sum;
    }

    public static int count(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
