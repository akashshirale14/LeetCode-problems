public class TrappingRainWater {
    public static void main(String[] args) {
      int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
      int a=trap(height);
        System.out.println(a);
    }

    public static int trap(int[] height){
        int current=0;           //3
        int store=0;
        for(int i=0;i<height.length;i++){
            if(height[i]==0){
                continue;
            }
            if(height[i]>0){
                current=height[i];   //c=2 and i=3
            }
            for(int j=i+1;j<height.length;j++){ //j=4
                if(height[j]>=current){
                    store=store+current;
                    break;
                }
            }
        }

    return store;
    }
}
