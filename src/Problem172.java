import java.util.Scanner;

public class Problem172 {

    public static void main(String[] args) {
        Problem172 r=new Problem172();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        sc.nextLine();
       int num= r.trailingZeroes(n);
       System.out.println("Trail is= "+num);
    }
    public  int trailingZeroes(int n) {
       int trail=0;
       int count=0;
       for(int i=5;n/i>0;i=i*5)
       {
            count= count + (n/i);
       }
        return count;
    }
}

