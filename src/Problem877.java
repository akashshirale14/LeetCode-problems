import java.lang.reflect.Array;

public class Problem877 {
    public static void main(String[] args) {
     int [] piles={5,3,4,5};
     boolean ans=stoneGame(piles);
        System.out.println(ans);

    }

    public static boolean stoneGame(int[] piles) {
         int sumA=0;
         int sumL=0;
         boolean controlA=true;
        int last= Array.getLength(piles);
         for (int i=0;i< Array.getLength(piles);i++) {
             if (i % 2 == 0 && controlA == true) {
                 if (piles[i] == -1) {
                     controlA = true;
                     continue;
                 }
                 last = last - (i + 1);
                if(last>0) {
                    if (piles[i] > piles[last]) {
                        sumA = sumA + piles[i];
                        piles[i] = -1;
                        controlA = false;
                    } else {
                        sumA = sumA + piles[last];
                        piles[last] = -1;
                        controlA = false;
                    }
                }
             }else {
                 if (piles[i] == -1) {
                     controlA = false;
                     continue;
                 }
                 last = last - (i + 1);
                 if(last>0) {
                     if (piles[i] > piles[last]) {
                         sumL = sumL + piles[i];
                         piles[i] = -1;
                         controlA = true;
                     } else {
                         sumL = sumL + piles[last];
                         piles[last] = -1;
                         controlA = true;
                     }
                 }

             }
         }
         if(sumL>sumA){
             return false;
         }

     return true;
    }
}
