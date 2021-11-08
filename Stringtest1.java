/* The string "PAYPALISHIRING" is written in a
zigzag pattern on a given number of rows like this: (you may
want to display this pattern in a fixed font for better legibility)
P.......A........H.......N
..A..P....L....S....I...I....G
....Y.........I........R
And then read line by line: PAHNAPLSIIGYIR
Write the code that will take a string and make this conversion
given a number of rows:
string convert(string text, int nRows);
convert("PAYPALISHIRING"
, 3) should return
"PAHNAPLSIIGYIR"
Example 2 :
ABCD, 2 can be written as
A....C
...B....D
*/

import java.util.*;

class Stringtest1
{			
	String convert(String text,int n)
		{
			StringBuffer sb=new StringBuffer(); 
			if(n<=1)
			{
				System.out.println(text);
			}
			else if(n==2)
			{
			for(int i=0;i<text.length();i++)
			{
				if(i==0)
				{
				for(int j=0;j<text.length();j=j+n)
				{
					sb.append(text.charAt(j));
				}
				}
				if(i==1)
				{
				for(int j=1;j<text.length();j=j+n)
				{
					sb.append(text.charAt(j));
				}
				}
			}
			}
			else
			{
				int inc=2*(n-1);
				int count=1;
				for(int i=0;i<n;i++)
				{
					for(int j=i;j<text.length();j=j+inc)
					{
						sb.append(text.charAt(j));
						if (i != 0 && i != n - 1 && (j + inc- 2 * i) < text.length()) 
						sb.append(text.charAt(j + inc - 2 * i));
					}
				}
			}
			return sb.toString();
		}
		
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String text=sc.next();
		int n=sc.nextInt();
		Stringtest1 S1=new Stringtest1();
		System.out.print(S1.convert(text,n));
	}
}	
