import java.util.*;

class Problem13HashMap{
	public static void main(String args[]){
     int ans=romanToInt("MCMXCIV");
     System.out.println(ans);
	}

	public static int romanToInt(String s){
	HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
	hmap.put('I',1);
	hmap.put('V',5);
	hmap.put('X',10);
	hmap.put('L',50);
	hmap.put('C',100);
	hmap.put('D',500);
	hmap.put('M',1000);
	int len=s.length();
	int i=0,result=0;
	while(i<len){
		Character currChar=s.charAt(i);
		Character prevChar=null;
		if(i==0){
			result+=hmap.get(currChar);
		}
		else{
			prevChar=s.charAt(i-1);
			if(hmap.get(prevChar)<hmap.get(currChar)){
				result+=hmap.get(currChar)-2*hmap.get(prevChar);
			}
			else{
				result+=hmap.get(currChar);
			}
		}
		i++;
	}	
	return result;
   }
}



