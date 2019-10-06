package model;
import java.util.*;

public class Legion{
	//Atributes
	private Archangel archangel[];
	private int a;
	private String msg;
	
	public Legion(int a){
		this.a = a;
		archangel = new Archangel[this.a];
	}
	
	/**
*<b>Name:</b> makeCandle.<br>
*This method fills the information required to create a candle and calls createCandle.<br>
*<b>Pos:</b> "color" candle has been registered to "angel".<br>
*/

	public void makeCandle(){

		for(int i = 0; i < a; i++){
			if(msg.equals("Memory full") || msg.equals("This power already exists in memory") || msg.equals("This archangel already exists in memory")){
			System.out.println("Unable to create candle");
			break;}
			
			else if(archangel[i] != null && archangel[i].getCandle() == null){
					Scanner user = new Scanner(System.in);
					Scanner user2 = new Scanner(System.in);
					System.out.println("Enter candle color");
					String color = user.nextLine();
					System.out.println("Enter candle's size");
					double size = user2.nextDouble();
					System.out.println("Enter candle's essence");
					String essence = user.nextLine();
					System.out.println("Enter candle's illuminance (measured in lux)");
					double illuminance = user2.nextDouble();
				    archangel[i].createCandle(color, size, essence, illuminance);
				    System.out.println(color + " candle" + " has been registered to " + archangel[i].getName());
				    break;
			}
		}
	}
	
/**
*<b>Name:</b> angelCreator.<br>
*This method Creates an angel and then calls for makeCandle.<br>
*@param name The name of the angel, that must finish on "el". <br>
*@param photo The direction where is the foto of the angel.<br>
*@param prayer The prayer of the angel.<br>
*@param day The day when is the celebration of the angel.<br>
*@param month The month when is the celebration of the angel.<br>
*@param power The power of the angel.<br>
*<b>Pos:</b> Memory full // This archangel already exists in memory // This power already exists in memory // Archangel registered successfully<br>
*@return msg message showing what has happened on the method <br>
*/
	
	public String createArchangel(String name, String picture, String prayer, int dayCeleb, String monthCeleb, String power){
			Archangel b = new Archangel(name, picture, prayer, dayCeleb, monthCeleb, power);
			boolean validation = true;
			int i;
			msg = "";
			
			for(i = 0; i < a; i++){
					if (i == archangel.length-1 && archangel[i] != null){
					msg = "Memory full";
					validation = false;
				}
			}
			
			
			
			
			for(i = 0; i < a; i++){
				if (archangel[i] != null && archangel[i].getName().equals(name)){
					msg = "This archangel already exists in memory";
					validation = false;
				}
			}
				
				
			for(i = 0; i < a; i++){
				if (archangel[i] != null && archangel[i].getPower().equals(power)){
					msg = "This power already exists in memory";
					validation = false;
				}
			}
			
			if (validation == true){
				for(i = 0; i < a; i++){
					if(archangel[i] == null){
						archangel[i] = b;
						msg = "Archangel registered successfully";
						makeCandle();
						break;
					}
				}
			}
			
			System.out.println(msg);
			return msg;

		
}


/**
*<b>Name:</b> angelSearcher.<br>
*This method searchs an angel in memory with the name given by the user and shows its information.<br>
*@param sname The name of the angel to search on memory. <br>
*<b>Pos:</b> Information of the angel // There is no angel in memory with that name.<br>
*/

	public void angelSearcher(String sname){
		for(int i = 0; i < a; i++){
			if(archangel[i] != null && archangel[i].getName().equals(sname)){
				System.out.printf("%n" + archangel[i].getName() + "%n" + archangel[i].getPicture() + "%n" + archangel[i].getPrayer() + "%n" + archangel[i].getMonthCeleb() + "%n" + archangel[i].getPower() + archangel[i].getCandleInfo() + "%n");
				break;
			}
			else if (i == archangel.length-1){System.out.println("There is no angel in memory with that name");}
		}
	}


/**
*<b>Name:</b> powerSearcher.<br>
*This method searchs an angel in memory with the power given by the user and shows its information.<br>
*@param power The power of the angel to search on memory. <br>
*<b>Pos:</b> Information of the angel // There is no angel in memory with that power.<br>
*/
	
	public void powerSearcher(String power){
		for(int i = 0; i < a; i++){
			if(archangel[i] != null && archangel[i].getPower().equals(power)){
				System.out.printf("%n" + archangel[i].getName() + "%n" + archangel[i].getPicture() + "%n" + archangel[i].getPrayer() + "%n" + archangel[i].getMonthCeleb() + "%n" + archangel[i].getPower() + "%n");
				System.out.printf(archangel[i].getCandleInfo() + "%n");
				break;
			}
			
			else if(i == archangel.length-1){System.out.println("There is no angel in memory with that power");}
		}
	}

/**
*<b>Name:</b> monthCelebrations.<br>
*This method shows all the celebrations in a given month with their respective day, candle color and essence.<br>
*@param smonth The month to show celebrations from. <br>
*<b>Pos:</b> "angel" has a celebration on "month" on "day", its candle is "color" and its essence is "essence" // There are no celebrations in that month.<br>
*/	
	public void monthCelebrations(String smonth){
		for(int i = 0; i < a; i++){
			if(archangel[i] != null && archangel[i].getMonthCeleb().toLowerCase().equals(smonth)){
				System.out.println(archangel[i].getName() + " has a celebration on " + smonth + " on " + archangel[i].getDayCeleb() + "," + " its candle is " + archangel[i].getCandleColor() + " and its essence is " + archangel[i].getCandleEssence());
			}
			
			else if(i == archangel.length-1){System.out.println("There are no celebrations in that month");}
		}
	}
	

/**
*<b>Name:</b> countAngels.<br>
*This method counts the number of angels in the array.<br>
*<b>Pos:</b> There are "counter" angels in memory.<br>
*/	
	public void countAngels(){
		int counter = 0;
		for (int i = 0; i < a; i++){
			if (archangel[i] != null){
				counter++;
			}
		}
		
		if (counter == 1){System.out.println("There is 1 angel in memory");}
		
		else System.out.println("There are " + counter + " archangels in memory");
	}

/**
*<b>Name:</b> showAll.<br>
*This method shows all angels with their month and day of celebration.<br>
*<b>Pos:</b> All angels with their name, month and day of celebration.<br>
*/

	public void showAll(){
		String msg1 = "";
		for(int i = 0; i < a; i++){
			if(archangel[i] != null && i == archangel.length-1){
				msg1 += archangel[i].getName() + " " + archangel[i].getMonthCeleb() + " of " + archangel[i].getDayCeleb() + ".";
			}
		
			else if(archangel[i] != null){
				msg1 += archangel[i].getName() + " " + archangel[i].getMonthCeleb() + " of " + archangel[i].getDayCeleb() + "," + " "; 
			}
		}
		System.out.println(msg1);
	}
}