package EPAM.CLEAN.CODE.Interest;
import EPAM.CLEAN.CODE.printer.*;
import java.util.Scanner;
 public class interest {
 int choice,principleamount,time,n;
 //n is the number of times that interest is compounded per time t
double rate;
Printer p=new Printer();
Scanner s=new Scanner(System.in);
simpleinterest si=new simpleinterest();
compoundinterest ci=new compoundinterest();
	public void selectinterest()
{
	p.outputtext("Enter Your choice to calcuate interest :");
	p.outputtext("1. Simple Interest");
	p.outputtext("2. Compound Interest");
	choice =s.nextInt();
}
	public void operations()
	{if((0<choice)&&(choice<3)) {
	switch(choice)
	{
	case 1:
		p.outputtext("Enter Principle Amount");
		principleamount=s.nextInt();
		p.outputtext("Enter rate of interest :");
		rate=s.nextDouble();
		p.outputtext("Enter time period :");
		time=s.nextInt();
		si.calculatesimpleinterest(principleamount, time, rate);
		break;
	case 2:
		p.outputtext("Enter Principle Amount");
		principleamount=s.nextInt();
		p.outputtext("Enter rate of interest (%) :");
		rate=s.nextDouble();
		p.outputtext("Enter Number of time period Elapsed :");
		time=s.nextInt();
		p.outputtext("Enter number of times that interest applied per time period");
		n=s.nextInt();
		ci.calculate(principleamount, time, rate, n);
		break;
	}
}
	else
	{
		p.outputtext("You Have Choosen Invalid Input");
		p.outputtext("Try Executing the Program Again!! From the BEGIN with a Valid Input");
	}	
	}
	}
