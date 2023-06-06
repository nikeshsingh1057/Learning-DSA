//  method 1st gfg

import java.util.* ;
import java.io.*; 

public class Solution {

	public static boolean duplicateParanthesis(String str) {
		
	 	Stack<Character> st = new Stack<>();

		for(int i=0;i<str.length();i++){

			if(str.charAt(i)==')'){

				char ch=st.pop();

				int element=0;
				while(ch!='('){

					element++;
					ch=st.pop();
				}
				
				if(element==0)
					return true;
			}
			else
				st.push(str.charAt(i));
		}
		return false;
	}

}

// method 2nd sumit mallik sir

import java.util.* ;
import java.io.*; 

public class Solution {

	public static boolean duplicateParanthesis(String str) {
		
	 	Stack<Character> st = new Stack<>();

		for(int i=0;i<str.length();i++){

			if(str.charAt(i)==')'){
				
				if(st.peek()=='(')
					return true;
				else{

					while(st.peek()!='('){
						st.pop();
					}
					st.pop();
				}

			}
			else
				st.push(str.charAt(i));
		}
		return false;
	}

}

