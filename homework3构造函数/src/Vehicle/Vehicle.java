package Vehicle;

import java.net.PortUnreachableException;

public class Vehicle {
	private String brand;
	private String color;
	private double speed;
	
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
		
	}
	public void setColor( String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
		
	}
	public Vehicle(String brand, String color,double speed) {
		this.brand=brand;
		this.color=color;
		this.speed=speed=0;
	}
	public Vehicle() {
	}
	
	public void run() {
		System.out.println(color+"的"+brand+"可以跑到很快哦~");
	}
	

}
