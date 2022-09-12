/*Problem Statement
You are given two strings S1 and S2 of length N. You need to make those strings equal by replacing any index in string S1 with any character. The cost incurred is as follows:
You pay X units for the first replacement, you do not pay anything for the second replacement, you pay X units for the third replacement, you do not pay anything for the fourth replacement, and so on.

Find the total units you need to pay to make S1 equal to S2. */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int x=sc.nextInt();
		String s1=sc.next();
		String s2=sc.next();
		int count=0;
		int sum=0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				count+=1;
				//i++;
				if(count%2!=0){
					sum+=x;
				}
			}
		}
		System.out.println(sum);
		

	}
}