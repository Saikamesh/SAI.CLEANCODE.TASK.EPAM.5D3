package EPAM.CLEAN.CODE;
import EPAM.CLEAN.CODE.Interest.*;
import EPAM.CLEAN.CODE.HouseConstruction.*;
import EPAM.CLEAN.CODE.printer.*;
import java.util.Scanner;; 
public class cleancodemain
{
	public static void main(String[] args)
	{
	Printer p=new Printer();
	p.outputtext("Welcome to clean code");
	p.outputtext("Select A Program for Execution :");
	p.outputtext("1. Calculate Simple Interest/Compound Interest");
	p.outputtext("2. Calculate the Cost For Construction of a House");
	Scanner scan=new Scanner(System.in);
	int Programchoice=scan.nextInt();
	if((0 < Programchoice) &&(Programchoice < 3))
	{
	switch(Programchoice)
		{
		case 1:
			interest i=new interest();
			i.selectinterest();
			i.operations();
			break;
		case 2:
			construction c=new construction();
			c.materialtype();
			c.calculatecost();
			break;
		}
	scan.close();
	}
	else
	{
		p.outputtext("You Have Choosen Invalid Input");
		p.outputtext("Try Executing the Program Again!! From the BEGIN with a Valid Input");
	}
}
}
