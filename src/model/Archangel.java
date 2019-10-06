package model;
public class Archangel{
	//Atributes
	private Candle c1;
	private String name;
	private String picture;
	private String prayer;
	private int dayCeleb;
	private String monthCeleb;
	private String power;
	
	//Builder
	public Archangel(String name, String picture, String prayer, int dayCeleb, String monthCeleb, String power){

		int a = name.length();
		int d = a - 2;
		String b = Character.toString(name.charAt(d));
		String c = Character.toString(name.charAt(--a));
		if(b.equals("e") && c.equals("l")){
		this.name = name;
		this.picture = picture;
		this.prayer = prayer;
		this.dayCeleb = dayCeleb;
		this.monthCeleb = monthCeleb;
		this.power = power;}
		
		
		else System.out.println("Archangel's name does not end in the letter E and/or L");
	}
	
	//Methods
	public String getName(){
		return name;
	}
	
	public String getPicture(){
		return picture;
	}
	
	public String getPrayer(){
		return prayer;
	}
	
	public int getDayCeleb(){
		return dayCeleb;
	}
	
	public String getMonthCeleb(){
		return monthCeleb;
	}
	
	public String getPower(){
		return power;
	}
	
	public Candle getCandle(){
		return c1;
	}
	
	public String getCandleColor(){
		String ei = "";
		System.out.println("Candle color:" + " " + c1.getColor());
		return ei;
	}
    
	public String getCandleEssence(){
		String ei = "";
		System.out.println("Candle essence:" + " " + c1.getEssence());
		return ei;
	}
	
	public String getCandleInfo(){
		String ei = "";
		System.out.println("Candle color:" + " " + c1.getColor());
		System.out.println("Candle size:" + " " + c1.getSize());
		System.out.println("Candle essence:" + " " + c1.getEssence());
		System.out.println("Candle illuminance:" + " " + c1.getIlluminance() + " lux");
		return ei;
	}
	
/**
*<b>Name:</b> createCandle.<br>
*This method creates a new object of candle and links it to the archangel.<br>
*@param color The color of the candle.<br>
*@param size The size of the candle.<br>
*@param essence The essence of the candle.<br>
*@param illuminance The iluminance of the candle<br>
*<b>Pos:</b> Candle has been created.<br>
*/

	public void createCandle(String color, double size, String essence, double illuminance){
		Candle can1 = new Candle(color, size, essence, illuminance);
		c1 = can1;
	}
}