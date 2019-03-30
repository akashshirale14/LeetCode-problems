public class ReverseNumber {
    public static void main(String[] args) {
        int a=reverse(-1237896479);
        System.out.println(a);
    }
    public static int reverse(int x){
        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE){
            return 0;
        }else{
        int sum=0;
        int flag=0;
        if(x<0){
            x=x*-1;
            flag=1;
        }
        while(x!=0) {

            int a = x % 10;
            sum=sum*10+a;
            x=x/10;
        }
        if(flag==1){
            return sum*-1;
        }
        return  sum;
    }
}
}
