package javaexamples;

class parent
{
public void p()
{
System.out.println("This is a parent class");
}
}
class child extends parent
{
public void c()
{
System.out.println("This is a child class");
}
}

public class ParentChildClass {

public static void main(String[] args) {
// TODO Auto-generated method stub
parent pc = new parent();
child cc = new child();
parent pcp = new child();
System.out.println("calling the parent method using Parent Object");
pc.p();
System.out.println();
System.out.println("calling the child method using Child Object");
cc.c();
System.out.println();
System.out.println("calling the Parent method using Child Object");
pcp.p();

}

}