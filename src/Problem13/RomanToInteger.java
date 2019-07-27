package Problem13;

public class RomanToInteger {
    public static void main(String[] args) {
        String s="MMDLV";
        int ans=romanint(s);
        System.out.println("Ans ="+ans);
    }

    public static int romanint(String s){
        char[] s1= s.toCharArray();
        int sum=0;
        for(int i=0;i<s1.length;i++){
            if(s1[i]=='I'){
               sum+=1;

            }
            if(s1[i]=='V'){
                if(i>0 && s1[i-1]=='I' ){
                    sum-=1;
                    sum+=4;
                }
                else{
                    sum+=5;
                }
            }
            if(s1[i]=='X'){
               if(i>0 && s1[i-1]=='I'){
                   sum-=1;
                   sum+=9;
               }
               else{
                   sum+=10;
               }
            }
            if(s1[i]=='L'){
                if(i>0 && s1[i-1]=='X' ){
                    sum-=10;
                    sum+=40;
                }
                else{
                    sum+=50;
                }
            }
            if(s1[i]=='C'){
                if(i>0 && s1[i-1]=='X'  ){
                    sum-=10;
                    sum+=90;
                }
                else{
                    sum+=100;
                }
            }
            if(s1[i]=='D'){
                if(i>0 && s1[i-1]=='C' ){
                    sum-=100;
                    sum+=400;
                }
                else{
                    sum+=500;
                }
            }
            if(s1[i]=='M'){
                if(i>0 && s1[i-1]=='C' ){
                    sum-=100;
                    sum+=900;
                }
                else{
                    sum+=1000;
                }
            }
        }
     return sum;
    }
}
