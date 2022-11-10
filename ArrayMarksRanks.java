package javaexamples;

public class ArrayMarksRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mrk[]= {100,88,89,80,90,95};
		int rnk[]= {1,2,3,4,5,6};
		int n= mrk.length;
		int tmp;
//		int lar,sml;
		
		for(int i=0;i<n-1;i++)
		{
				if(mrk[i]>mrk[i+1])
				{
					tmp=mrk[i];
					mrk[i]=mrk[i+1];
					mrk[i+1]=tmp;
				}
		}
		System.out.println("Marks - Rank");
		for(int i=n-1,k=0;i>=0;i--)
		{
			System.out.println(mrk[i]+"   -   "+rnk[k]);
			k++;
		}
	}

}