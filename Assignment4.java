package myApps;

public class Assignment4 {
private String sname;
private String sclass;
private int sage; 

public String getSname(){
	return sname;
}
public void setSname(String sname)
{
	this.sname=sname;
}
public String getSclass(){
	return sclass;
}
public void setSclass(String sclass)
{
	this.sclass=sclass;
}
public int getSage(){
	return sage;
}
public void setSage(int sage)
{
	this.sage=sage;
}
public static void main(String args[])
{
	Assignment4 aas4=new Assignment4();
	aas4.setSname("Hamza");
	aas4.setSclass("5th");
	aas4.setSage(25);
	
	System.out.println("Name "+aas4.getSname()+ " Class "+aas4.getSclass()+" Age "+aas4.getSage());
}
}
