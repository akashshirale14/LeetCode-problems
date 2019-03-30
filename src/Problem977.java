import java.util.Arrays;

public class Problem977 {
    public static void main(String[] args) {
       int[] A={-4,-1,0,3,10};
       int[] arr= sortedSquares(A);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] sortedSquares(int[] A) {
           for (int i=0;i<A.length;i++){
               A[i]=A[i]*A[i];
           }
        for (int i=0;i<A.length;i++) {
            System.out.println(A[i]);
        }
         Arrays.sort(A);


    return  A;
    }
}
