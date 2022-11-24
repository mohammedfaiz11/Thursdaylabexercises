package javaexamples;
import java.util.*;
class details
{
Scanner s = new Scanner(System.in);
public String sfname,slname, sage,scourse,sid;
public String efname,elname, eage,esal,eid,edept,edesig;
}
class Studentrecord extends details
{
public void getdetails()
{
System.out.println("Enter the Student First name :");
sfname=s.next();
System.out.println("Enter the Student Last name :");
slname=s.next();
System.out.println("Enter the Student age : ");
sage=s.next();
System.out.println("Enter the Student course : ");
scourse=s.next();
System.out.println("Enter the Student ID : ");
sid=s.next();
}
public void display()
{
System.out.println("The Student Details are :");
System.out.println("Student ID : "+sid);
System.out.println("Student first name : "+sfname);
System.out.println("Student last name : "+slname);
System.out.println("Student age : "+sage);
System.out.println("Student Course : "+scourse);

}
}
class Employeerecord extends details
{
public void getdetails()
{
System.out.println("Enter the Employee First name :");
efname=s.next();
System.out.println("Enter the Employee Last name :");
elname=s.next();
System.out.println("Enter the Employee age : ");
eage=s.next();
System.out.println("Enter the Employee Salary : ");
esal=s.next();
System.out.println("Enter the Employee Department Name : ");
edept=s.next();
System.out.println("Enter the Employee Designation : ");
edesig=s.next();
System.out.println("Enter the Employee ID : ");
eid=s.next();
}
public void display()
{
System.out.println("The Employee Details are :");
System.out.println("Employee ID : "+eid);
System.out.println("Employee first name : "+efname);
System.out.println("Employee last name : "+elname);
System.out.println("Employee age : "+eage);
System.out.println("Employee Salary : "+esal);
System.out.println("Employee Department name : "+edept);
System.out.println("Employee Designation : "+edesig);
}
}
public class StudentEmployeeDetails {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n,sh;
Studentrecord sr = new Studentrecord();
Employeerecord er = new Employeerecord();
System.out.println("Enter 1 for Student Details \nEnter 2 for Employee Details.");
n=sc.nextInt();
if(n==1)
sr.getdetails();
else
er.getdetails();
System.out.println("3. To Show Details");
sh=sc.nextInt();
if(sh==3)
{
if(n==1)
sr.display();
else
er.display();
}
sc.close();
}

}