import java.util.Scanner;

public class topic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(x).reverse();
        String s1 = sb.toString();
        StringBuilder newSb = new StringBuilder();
        newSb.append(x);
        String s2 = newSb.toString();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}