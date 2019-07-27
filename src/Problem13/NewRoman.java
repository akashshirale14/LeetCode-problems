package Problem13;

public class NewRoman {
    public static void main(String[] args) {
        String s="viii";
        int ans=romanint(s);
        System.out.println("Ans ="+ans);
    }
    public static int romanint(String s){
        int sum=0;
        int[]num= new int[26];
        num['I'-'A']=1;
        num['V'-'A']=5;
        num['X'-'A']=10;
        num['L'-'A']=50;
        num['C'-'A']=100;
        num['D'-'A']=500;
        num['M'-'A']=1000;
        char prev='A';

        for(char E:s.toCharArray()){
            if(num[E-'A'] > num[prev-'A']){
                sum=sum- 2*num[prev-'A'];
            }
            sum=sum+num[E-'A'];
            prev=E;
        }

        return sum;
    }
}
