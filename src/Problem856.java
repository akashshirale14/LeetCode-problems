public class Problem856 {

    public static void main(String[] args) {
       int a=scoreOfParentheses("(()(()))");
        System.out.println("Count "+a);
    }

    public static int scoreOfParentheses(String S) {

         int count1=0;
        int count2=0;
        for (int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                count1=count1+1;
            }
            if(S.charAt(i)==')')
            {
                count2=count2+1;
            }
            System.out.println(S.charAt(i));
        }
        if(count1!=count2){
            if(count1<count2){
                return count1;
            }
            else{
                return count2;
            }
        }
        return count1;
    }
}
