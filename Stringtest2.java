/*
Given a string s consists of upper/lower-case
alphabets and empty space characters ' '
, return the length of the
last word in the string.
If the last word does not exist, return 0.
Note: A word is defined as a character sequence consisting of
non-space characters only.
Example:
Given s = "Hello World"
,
return 5 as length("World") = 5.
*/

import java.util.*;
public class Stringtest2
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char ch[] = str.toCharArray();
		if(str.length()== 0)
		{
			System.out.println("0");
		}	
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]==' ') 
			{
				count= 0;
				continue;
			}
			count++;
		}
		System.out.println(count);
	}
	
}
			
			