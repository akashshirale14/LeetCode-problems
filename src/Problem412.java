//Leetcode problem Fizz Buzz
import java.util.*;
class Problem412{
	public static void main(String[] args){
		int n=15;
List<String> ans=new ArrayList<>();
ans= fizzBuzz(n);
for(String k:ans){
	System.out.println(k);
}
	}

	public static List<String> fizzBuzz(int n){
		List<String> ans=new ArrayList<>();
		for(int i=1;i<=n;i++){
			if(i%3 && i%5==0){
				ans.add("FizzBuzz");
			}
			else if(i%5==0){
				ans.add("Buzz");
			}
			else if(i%3==0){
				ans.add("Fizz");
			}
			else{
				ans.add(i);
			}
		}

		return ans;
	}
}