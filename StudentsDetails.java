package javaexamples;

import java.util.*;
public class StudentsDetails {
	Scanner s = new Scanner(System.in);
	String s_name,s_id,grd;
	int m[]=new int[3],avg,total;
	public StudentsDetails()
	{
		System.out.println("Enter a student name : ");
		s_name=s.next();
		System.out.println("Enter a student id : ");
		s_id=s.next();
		System.out.println("Enter a 3 subject marks : ");
		for(int i=0;i<3;i++)
		m[i]=s.nextInt();
	}
	public void process()
	{
		for(int i=0;i<3;i++)
			total=total+m[i];
		avg=total/3;
		if(avg>=80&&avg<=100)
		grd="A";
		else if(avg>=60&&avg<80)
			grd="B";
		else
			grd="C";
	}
	public void showdetails()
	{
		System.out.println("\tStudent name = "+s_name);
		System.out.println("\tStudent id = "+s_id);
		System.out.println("\tStudent total marks ="+total);
		System.out.println("\tStudent average = "+avg);
		System.out.println("\tStudent grade = "+grd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of students : ");
		n=sc.nextInt();
		StudentsDetails [] s=new StudentsDetails[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the following details for Student number - "+(i+1));
			s[i]=new StudentsDetails();
		}
		System.out.println("\n\n");
		System.out.println("\tThe student report is");
		System.out.println("   -----------------------------------");
		for(int i=0;i<n;i++)
		{
			System.out.println("     Following details for Student number - "+(i+1));
			s[i].process();
			s[i].showdetails();	
			System.out.println();
		}
	}

}