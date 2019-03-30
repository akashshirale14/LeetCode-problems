/*public class Problem151 {

    public static void main(String[] args) {
        String ans=reverseWords("      ");
        System.out.println(ans);
    }

    public static String reverseWords(String s) {
        String ans = "";
        int flag = 1;
        String[] words = s.split("\\s+");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                flag = 1;
            } else {
                 flag = 0;
            }
        }
        if (flag == 1) {
            return "";
        } else {
            if (s.length() == 1) {
                return s;
            }
            String[] words = s.split(" ");
            int last = words.length;
            //System.out.println(last);
            for (int i = last - 1; i >= 0; i--) {
                ans = ans + words[i] + " ";
            }

            return ans.substring(0, ans.length() - 1);
        }
    }


}*/
