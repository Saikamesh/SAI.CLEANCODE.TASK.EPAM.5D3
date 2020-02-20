package EPAM.CLEAN.CODE.Interest;
import EPAM.CLEAN.CODE.printer.*;
 public class simpleinterest
 {
Printer p=new Printer();
public void calculatesimpleinterest(int p,int t,double r)
	{
	double sinterest=(p*t*r)/100;
	System.out.println("Simple Interest is: "+ sinterest);
	}
}
