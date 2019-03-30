public class Problem824 {
    public static void main(String[] args) {
           String h=toGoatLatin("apple goat");
        System.out.println(h);
    }

    public static String toGoatLatin(String S){
              String [] words =S.split("\\W+");
              String ans= new String();
              for(int i=0;i<words.length;i++){
                 char e= words[i].charAt(0);
                 if(e=='A' || e=='E' ||e=='I' ||e=='O' ||e=='U' ||e=='a' ||e=='e' ||e=='i' ||e=='o' ||e=='u'){
                     words[i]=words[i]+"ma";
                 }else{
                     char dd=words[i].charAt(0);
                     words[i]=words[i].substring(1)+dd+"ma";
                 }
                 int k=i+1;
                  for(int j=0;j<k;j++){

                      words[i]= words[i]+"a";

                  }

                  ans=ans+words[i]+" ";
              }

       return ans.substring(0,ans.length());
    }
}
