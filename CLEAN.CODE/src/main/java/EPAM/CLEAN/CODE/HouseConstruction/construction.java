package EPAM.CLEAN.CODE.HouseConstruction;
import EPAM.CLEAN.CODE.printer.*;
import java.util.Scanner;
public class construction 
{
	static int materialtype;
	int area,cost;
	Scanner sc=new Scanner(System.in);
	Printer p=new Printer();
	public void materialtype()
	{
		p.outputtext("Select the type of material for construction");
		p.outputtext("----------Material Type----------");
		p.outputtext("1. Standard Material");
		p.outputtext("2. Above Standard Material");
		p.outputtext("3. High Standard Material");
		p.outputtext("4. High Standard Material & Fully Automated Home");
		p.outputtext("-------------------------------");
		p.outputtext("Note: Fully Automated Home Option is only Available for High Standard Material");
		materialtype=sc.nextInt();
	}
	public void calculatecost()
	{
		if((0<materialtype)&&(materialtype<5)) 
		{
		switch(materialtype)
		{
		case 1:
		p.outputtext("Enter the Area of House in Sq.ft's :");
		area=sc.nextInt();
		p.outputtext("-----cost for the construction of the House-----");
		p.outputtext("Material Type: Standard");
		p.outputtext("Housing Area in sq.ft's: "+area);
		cost=area*1200;
		p.outputint(cost);
		p.outputtext("INR only/-");
		break;
	case 2:
		p.outputtext("Enter the Area of House in Sq.ft's :");
		area=sc.nextInt();
		p.outputtext("-----cost for the construction of the House-----");
		p.outputtext("Material Type: Above Standard");
		p.outputtext("Housing Area in sq.ft's: "+area);
		cost=area*1500;
		p.outputint(cost);
		p.outputtext("INR only/-");
		break;
	case 3:
		p.outputtext("Enter the Area of House in Sq.ft's :");
		area=sc.nextInt();
		p.outputtext("-----cost for the construction of the House-----");
		p.outputtext("Material Type: High Standard");
		p.outputtext("Housing Area in sq.ft's: "+area);
		cost=area*1800;
		p.outputint(cost);
		p.outputtext("INR only/-");
		break;
	case 4:
		p.outputtext("Enter the Area of House in Sq.ft's :");
		area=sc.nextInt();
		p.outputtext("-----cost for the construction of the House-----");
		p.outputtext("Material Type: High Standard(FUllY AUTOMATED)");
		p.outputtext("Housing Area in sq.ft's: "+area);
		cost=area*2500;
		p.outputint(cost);
		p.outputtext("INR only/-");
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
