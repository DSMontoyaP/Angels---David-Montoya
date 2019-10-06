package ui;
import model.*;
import java.util.*;

public class MaximeSuperiores{
	public Legion l1;
	public int a;
	
	public MaximeSuperiores(){
		Scanner user = new Scanner(System.in);
		System.out.println("Please enter the number of archangels");
		a = user.nextInt();
		l1 = new Legion(a);
	}
	
	public static void main(String[] args){
		MaximeSuperiores ms = new MaximeSuperiores();
		int z = 1;
		Scanner user = new Scanner(System.in);
		Scanner user2 = new Scanner(System.in);
		boolean switc = true;
		while(switc == true){
			switch(z){
				case -1: System.out.printf("%n(1)Register archangel %n(2)Count angels %n(3)Show angel info by name%n(4)Show angel info by power%n(5)Show celebrations in a given month%n(6)Show all%n");
				z++;
				break;
			
				case 0: System.out.println("Please enter the operation (-1 for operation list)");
				z = user2.nextInt();
				break;
			
				case 1: 
				ms.newArch();
				z--;
				break;
			
				case 2: 
				ms.countAngels();
				z -= 2;
				break;
				
				case 3:
				System.out.println("Please enter the name of the archangel you wish to search");
				String sname = user.nextLine();
				ms.searchAngel(sname);
				z -= 3;
				break;
				
				case 4:
				System.out.println("Please enter the power you wish to search an angel with");
				String power = user.nextLine();

				ms.searchAngelPower(power);
				z -= 4;
				break;
				
				case 5:
				System.out.println("Please enter the month you wish to see celebrations from");				
				String smonth = user.nextLine();
				smonth.toLowerCase();
				ms.celebrations(smonth);
				z -= 5;
				break;
				
				case 6:
				ms.showA();
				z -= 6;
				break;
			}
	
		}
	} 
	
/**
*<b>Name:</b> newArch.<br>
*This method fills in the information required to create an archangel and calls the respective method.<br>
*/
	public void newArch(){
		Scanner user = new Scanner(System.in);
		Scanner user2 = new Scanner(System.in);
		System.out.println("Enter archangel name");
		String name = user.nextLine();
		System.out.println("Enter archangel's picture");
		String picture = user.nextLine();
		System.out.println("Enter archangel's prayer");
		String prayer = user.nextLine();
		System.out.println("Enter archangel's day of celebration");
		int dayCeleb = user2.nextInt();
		System.out.println("Enter archangel's month of celebration (name of the month)");
		String monthCeleb = user.nextLine();
		System.out.println("Enter archangel's power");
		String power = user.nextLine();
		l1.createArchangel(name, picture, prayer, dayCeleb, monthCeleb, power);
	}
/**
*<b>Name:</b> countAngels.<br>
*This method calls countAngels from Legion class.<br>
*/
	public void countAngels(){
		l1.countAngels();
	}
/**
*<b>Name:</b> searchAngel.<br>
*This method calls angelSearcher from Legion class.<br>
*/
	public void searchAngel(String sname){
		l1.angelSearcher(sname);
	}
/**
*<b>Name:</b> countAngels.<br>
*This method calls countAngels from Legion class.<br>
*/	
	public void searchAngelPower(String power){
		l1.powerSearcher(power);
	}

/**
*<b>Name:</b> celebrations.<br>
*This method calls monthCelebrations from Legion class.<br>
*/	
	public void celebrations(String smonth){
		l1.monthCelebrations(smonth);
	}
/**
*<b>Name:</b> showA.<br>
*This method calls showAll from Legion class.<br>
*/
	public void showA(){
		l1.showAll();
	}
}