public class DivideIntegers {
    public static void main(String[] args) {
        int ans=dividing(10,3);
        System.out.println("ans== "+ans);
    }

    public static int dividing(int dividend,int divisor){
        int flag=0;
        int remain=dividend;
        int count=0;
        if((dividend<0 && divisor<0)||(dividend>0 && divisor>0)){
            flag=1;
        }

        if(flag==1){
            while(remain< divisor){
                remain=dividend-divisor;
                count++;
            }
        }
    return count;
    }

}
