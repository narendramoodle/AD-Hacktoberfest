/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element for array");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element number "+i);
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
				break;
			}
		}
	System.out.println("Number is :>"+min);
		
		// your code goes here
	}
}