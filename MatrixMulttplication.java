package javaexamples;

public class MatrixMulttplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int c[][]=new int[a.length][b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				c[i][j]=0;
				for(int k=0;k<a.length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}