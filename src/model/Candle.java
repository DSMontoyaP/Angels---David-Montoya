package model;
public class Candle{
	//Atributes
	private String color;
	private double size;
	private String essence;
	private double illuminance;
	
	//Builder
	public Candle(String color, double size, String essence, double illuminance){
		this.color = color;
		this.size = size;
		this.essence = essence;
		this.illuminance = illuminance;
	}
	
	//Getters
	public String getColor(){
		return color;
	}
	
	public double getSize(){
		return size;
	}
	
	public String getEssence(){
		return essence;
	}
	
	public double getIlluminance(){
		return illuminance;
	}
}