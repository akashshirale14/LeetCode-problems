public class Problem171 {

    public static void main(String[] args) {

        int ans=titleToNumber("AAA");
        System.out.println(ans);
      /*  System.out.println("?????");
        int a=titleToNumber("ZZ");
        System.out.println(a);
*/
    }


    public static int titleToNumber(String s) {
        int sum=0;
        int level=0;
        int a;
        //BigInteger num,num2;
        //num = new BigInteger("25");
        for(int i=s.length()-1;i>=0;i--){
            a=(int)s.charAt(i)%64;
            //System.out.println((int)s.charAt(i)%64);
            if(level==0) {
                sum = (sum + a) ;
                //System.out.println("if "+a);
                System.out.println("if "+sum);
            }else{
                sum = sum + ((a) * (int)Math.pow(26,level));
                //System.out.println("else  "+a);
                System.out.println("else sum "+sum);
            }
            level++;
        }

        return sum;
        }



}
