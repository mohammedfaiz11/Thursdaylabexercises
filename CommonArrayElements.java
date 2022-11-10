package javaexamples;
import java.util.*;
public class CommonArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int b[]= {2,3,5,4,7,8};
		int c[]=new int[a.length];
		int n=0;
		
		for(int i=0,k=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==b[j])
				{
					c[k++]=a[i];
					n++;
				}
				
			}
				
		}
		System.out.println("common elements are...");
		for(int i=0;i<n;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}