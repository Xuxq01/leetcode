import java.util.Scanner;

public class topic58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder();
        String str = sb.append(s).reverse().toString();
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) != ' ') {
                count++;
            } else if (count != 0) {
                return count;
            }
        }
        return count;
    }
}